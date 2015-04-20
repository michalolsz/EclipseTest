package rozdzial4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Grep {
	protected Pattern pattern;
	protected Matcher matcher;
	protected static boolean countOnly=false;
	protected static boolean ignoreCase=false;
	protected static boolean dontPrintFileName=false;
	protected static boolean listOnly=false;
	protected static boolean numbered=false;
	protected static boolean silent=false;
	protected static boolean invert=false;
	protected static boolean recursive=false;
	
	public static void main(String[] argv) {

		if (argv.length < 1) {
		    System.exit(1);
		}
		String patt = null;

		GetOpt go = new GetOpt("cf:hilnrRsv");

		char c;
		while ((c = go.getopt(argv)) != 0) {
			switch(c) {
				case 'c':
					countOnly = true;
					break;
				case 'f':	/* External file contains the pattern */
					try (BufferedReader b = new BufferedReader(new FileReader(go.optArg()))) {
						patt = b.readLine();
					} catch (IOException e) {
						System.err.println("Can't read pattern file " + go.optArg());
						System.exit(1);
					}
					break;
				case 'h':
					dontPrintFileName = true;
					break;
				case 'i':
					ignoreCase = true;
					break;
				case 'l':
					listOnly = true;
					break;
				case 'n':
					numbered = true;
					break;
				case 'r':
				case 'R':
					recursive = true;
					break;
				case 's':
					silent = true;
					break;
				case 'v':
					invert = true;
					break;
				case '?':
					System.err.println("Getopts was not happy!");
					break;
			}
		}

		int ix = go.getOptInd();

		if (patt == null)
			patt = argv[ix++];

		Grep prog = null;
		try {
			prog = new Grep(patt);
		} catch (PatternSyntaxException ex) {
			System.err.println("RE Syntax error in " + patt);
			return;
		}

		if (argv.length == ix) {
			dontPrintFileName = true; // Don't print filenames if stdin
			if (recursive) {
				System.err.println("Warning: recursive search of stdin!");
			}
			prog.process(new InputStreamReader(System.in), null);
		} else {
			if (!dontPrintFileName)
				dontPrintFileName = ix == argv.length - 1; // Nor if only one file.
			if (recursive)
				dontPrintFileName = false;				// unless a directory!

			for (int i=ix; i<argv.length; i++) { // note starting index
				try {
					prog.process(new File(argv[i]));
				} catch(Exception e) {
					System.err.println(e);
				}
			}
		}
	}

	/**
	 * Construct a JGrep object.
	 * @param patt The regex to look for
	 * @throws PatternSyntaxException if pattern is not a valid regex
	 */
	public Grep(String patt) throws PatternSyntaxException {
		int caseMode = ignoreCase ?
			Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE :
			0;
		pattern = Pattern.compile(patt, caseMode);
		matcher = pattern.matcher("");
	}

	public void process(File file) throws FileNotFoundException {
		if (!file.exists() || !file.canRead()) {
			System.err.println(
				"ERROR: can't read file " + file.getAbsolutePath());
			return;
		}
		if (file.isFile()) {
			process(new BufferedReader(new FileReader(file)), 
				file.getAbsolutePath());
			return;
		}
		if (file.isDirectory()) {
			if (!recursive) {
				System.err.println(
					"ERROR: -r not specified but directory given " + 
					file.getAbsolutePath());
				return;
			}
			for (File nf : file.listFiles()) {
				process(nf);	// "Recursion, n.: See Recursion."
			}
			return;
		}
		System.err.println(
			"WEIRDNESS: neither file nor directory: " + file.getAbsolutePath());
	}

	/** Do the work of scanning one file
	 * @param	ifile	Reader	Reader object already open
	 * @param	fileName String	Name of the input file
	 */
	public void process(Reader ifile, String fileName) {

		String inputLine;
		int matches = 0;

		try (BufferedReader reader = new BufferedReader(ifile)) {

			while ((inputLine = reader.readLine()) != null) {
				matcher.reset(inputLine);
				if (matcher.find()) {
					if (listOnly) {
						// -l, print filename on first match, and we're done
						System.out.println(fileName);
						return;
					}
					if (countOnly) {
						matches++;
					} else {
						if (!dontPrintFileName) {
							System.out.print(fileName + ": ");
						}
						System.out.println(inputLine);
					}
				} else if (invert) {
					System.out.println(inputLine);
				}
			}
			if (countOnly)
				System.out.println(matches + " matches in " + fileName);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}