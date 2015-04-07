package rozdzial4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GetOpt {
	protected List<String> fileNameArguments;
	protected final GetOptDesc[] options;
	protected int optind = 0;

	public static final int DONE = 0;
	protected boolean done = false;
	protected String optarg;
	
	public String optArg() {
		return optarg;
	}

	public GetOpt(final GetOptDesc[] opt) {
		this.options = opt.clone();
	}

	public GetOpt(final String opt) {
		if (opt == null) {
			throw new IllegalArgumentException("Options may not be null");
		}
		if (opt.charAt(0) == ':') {
			throw new IllegalArgumentException(
				"Options pattern incorrect, may not begin with ':'");
		}

		int n = 0;
		for (char ch : opt.toCharArray()) {
			if (ch != ':')
				++n;
		}
		if (n == 0) {
			throw new IllegalArgumentException(
				"No option letters found in " + opt);
		}

		// Pass Two: construct an array of GetOptDesc objects.
		options = new GetOptDesc[n];
		for (int i = 0; i<opt.length(); i++) {
			if (i < opt.length() - 1 && opt.charAt(i+1) == ':') {
				++i;
			}
		}
	}

	public void rewind() {
		fileNameArguments = null;
		done = false;
		optind = 0;
		optarg = null;
	}


	public Map<String,String> parseArguments(String[] argv) {
		Map<String, String> optionsValueMap = new HashMap<String, String>();
		fileNameArguments = new ArrayList<String>();
		for (int i = 0; i < argv.length; i++) {	// Cannot use foreach, need i
			char c = getopt(argv);	
			if (c == DONE) {
				fileNameArguments.add(argv[i]);
			} else {
				optionsValueMap.put(Character.toString(c), optarg);
				if (optarg != null) {
					i++;
				}
			}
		}
		return optionsValueMap;
	}

	public List<String> getFilenameList() {
		if (fileNameArguments == null) {
			throw new IllegalArgumentException(
				"Illegal call to getFilenameList() before parseOptions()");
		}
		return fileNameArguments;
	}


	public char getopt(String argv[]) {

		if (optind >= (argv.length) || !argv[optind].startsWith("-")) {
			done = true;
		}
		if (done) {
			return DONE;
		}
		
		optarg = null;

		String thisArg = argv[optind];

		if (thisArg.startsWith("-")) {
			for (GetOptDesc option : options) {
				if ((thisArg.length() == 2 &&
						option.getArgLetter() == thisArg.charAt(1)) ||
				   (option.getArgName() != null &&
					option.getArgName().equals(thisArg.substring(1)))) { // found it
					// If it needs an option argument, get it.
					if (option.takesArgument()) {
						if (optind < argv.length-1) {
							optarg = argv[++optind]; 							
						} else {
							throw new IllegalArgumentException(
								"Option " + option.getArgLetter() +
								" needs value but found end of arg list");
						}
					}
					++optind;
					return option.getArgLetter();
				}
			}
			++optind;
			return '?';
		} else {
			++optind;
			done = true;
			return DONE;
		}
	}

	public int getOptInd() {
		return optind;
	}

}
