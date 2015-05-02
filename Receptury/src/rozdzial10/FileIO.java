package rozdzial10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class FileIO {
	protected static final int blksize=16384;
	private FileIO(){
		
	}
	
	public static void copyFile(String in,String out) throws IOException{
		BufferedInputStream is=null;
		BufferedOutputStream os=null;
		try{
			is=new BufferedInputStream(new FileInputStream(in));
			os=new BufferedOutputStream(new FileOutputStream(out));	
			copyFile(is,os,false);
		}finally{
			if(is!=null)
				is.close();
			if(os!=null)
				os.close();
		}
	}
	
	public static void copyFile(InputStream is,OutputStream os,boolean close) throws IOException{
		byte[] b=new byte[blksize];
		int i;
		while((i=is.read(b))!=-1)
			os.write(b, 0, i);
		is.close();
		if(close) os.close();
	}
	
	public static void copyFile(Reader is,Writer os,boolean close) throws IOException{
		int b;
		while((b=is.read())!=-1){
			os.write(b);
		}
		is.close();
		if(close) os.close();
	}
	public static void copyFile(String in,PrintWriter pw,boolean close) throws IOException{
		BufferedReader ir=new BufferedReader(new FileReader(in));
		copyFile(ir, pw,close);
	}
	public static void copyFile(File file,File target) throws IOException{
		if(!file.exists() || !file.isFile() || !file.canRead()) throw new IOException("nie mozna odczytac tego pliku");
		
		File dest=target;
		if(target.isDirectory()) dest=new File(dest,file.getName());
		InputStream is=null;
		OutputStream os=null;
		try{
			is=new FileInputStream(file);
			os=new FileOutputStream(dest);
			int count=0;
			byte[] b=new byte[blksize];
			while((count=is.read(b))!=-1) os.write(b, 0, count);
		}finally{
			is.close();
			os.close();
		}
		
	}
	public static void copyRec(File fromDir,File toDir,boolean create) throws IOException{
		if(!fromDir.exists()) throw new IOException("Katalog zrodlowy nie istnieje");
		if(create) toDir.mkdirs();
		else if(!toDir.exists()) throw new IOException("Katalog docelowy nie istnieje");
		
		for(File src:fromDir.listFiles()){
			if(src.isDirectory()){
				File destSubDir=new File(toDir,src.getName());
				copyRec(src, destSubDir, create);
			}else if(src.isFile())
				copyFile(src, toDir);
		}
	}
	public static void deleteRecursively(File startDir) throws IOException{
		String startDirPath=startDir.getCanonicalPath();
		for(File f:startDir.listFiles()){
			if(!f.getCanonicalPath().startsWith(startDirPath)) throw new IOException("Proba wyjscia z katalogu ");
			if(f.isDirectory())
				deleteRecursively(f);
			else{
				f.delete();
			}
		}
		startDir.delete();
		
			
	}

}
