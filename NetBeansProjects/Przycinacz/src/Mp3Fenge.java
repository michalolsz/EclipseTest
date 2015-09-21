import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import com.google.code.mp3fenge.Mp3Info;
import com.google.code.mp3fenge.util.FileUtil;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3AudioHeader;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.TagException;

public class Mp3Fenge {	
	private static double TIME_PER_FRAME = 26.122448979591838;
	private File mp3File;
	private Mp3Info mp3Info;
	
	public Mp3Fenge(File mp3File){
		this.mp3File = mp3File;
	}
	
	public File getMp3File() {
		return mp3File;
	}

	public void setMp3File(File mp3File) {
		this.mp3File = mp3File;
	}	
	/**
	 * get audio data by bit rate 
	 * @param beginTime start time, unit ms
	 * @param endTime end time, unit ms
	 * @return
	 */
	private byte[] getDataByBitRate(int beginTime, int endTime){
		byte[] result = null;
		RandomAccessFile rMp3File = null;
		try{
			MP3File mp3 = new MP3File(mp3File);
			MP3AudioHeader header = (MP3AudioHeader) mp3.getAudioHeader();
			if(header.isVariableBitRate()){
				result = null;
			} else {
				long mp3StartIndex = header.getMp3StartByte();	
				int trackLengthMs = header.getTrackLength()*1000;
				long bitRate = header.getBitRateAsNumber();
				long beginIndex = bitRate*1024/8/1000*beginTime+mp3StartIndex;
				long endIndex = beginIndex + bitRate*1024/8/1000*(endTime-beginTime);
				if(endTime > trackLengthMs){
					endIndex = mp3File.length()-1;
				}
				
				
				rMp3File = new RandomAccessFile (mp3File,"r");
				rMp3File.seek(beginIndex);
				int size = (int)(endIndex - beginIndex);
				result = new byte[size];
				rMp3File.read(result);
			}
		}catch(IOException | TagException | ReadOnlyFileException | InvalidAudioFrameException e){
			e.printStackTrace();
		} finally {
			if(rMp3File!=null){
				try {
					rMp3File.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}	
	
	/**
	 * get mp3 audio data by time interval
	 * @param beginTime start time, unit ms
	 * @param endTime end time, unit ms
	 * @return mp3 audio data
	 */
	public byte[] getDataByTime(int beginTime, int endTime){
		return getDataByBitRate(beginTime,endTime);
	}
	
	/**
	 * generate new mp3 fragment file by time interval
	 * @param beginTime start time, unit ms
	 * @param endTime end time, unit ms
	 * @param newMp3 new mp3 file
	 */
	public void generateNewMp3ByTime(File newMp3, int beginTime, int endTime){
		byte[] frames = getDataByTime(beginTime,endTime);
		if(frames == null || frames.length < 1){
			return;
		}
		List<byte[]> mp3datas = new ArrayList<byte[]>();
		mp3datas.add(frames);
		FileUtil.generateFile(newMp3, mp3datas);
	}
	

}