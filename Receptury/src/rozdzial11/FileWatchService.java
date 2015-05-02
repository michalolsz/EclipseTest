package rozdzial11;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import static java.nio.file.StandardWatchEventKinds.*;

public class FileWatchService {
	final static String tmpDirPath="\test";
	static Thread mainRunner;
	static volatile boolean done=false;

	public static void main(String[] args) throws IOException, InterruptedException {
		String dir="test";
		System.out.println("Rozpoczeto obeswacje katalagu "+dir);
		Path p=Paths.get(dir);
		WatchService watchService = FileSystems.getDefault().newWatchService();
		p.register(watchService,ENTRY_CREATE,ENTRY_DELETE,ENTRY_MODIFY);
		mainRunner=Thread.currentThread();
		while(!done){
			WatchKey key=watchService.take();
			for(WatchEvent<?> e:key.pollEvents()){
				System.out.println("Zdarzenie "+e.kind()+" dotyczace "+e.context());
				if(e.context().toString().equals("zamykacz.txt")){
					done=true;
				}
								
			}
			if(!key.reset());
			
		}
		

	}

}
