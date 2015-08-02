
public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int h=seconds/3600;
    String hh="";
    if((h+"").length()!=2) hh="0"+h;
    else hh=h+"";
    int m=(seconds/60)%60;
    String mm="";
    if((m+"").length()!=2) mm="0"+m;
    else mm=m+"";
    int s=(seconds%60);
    String ss="";
    if((s+"").length()!=2) ss="0"+s;
    else ss=s+"";
    return hh+":"+mm+":"+ss;
    //return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
  }


	public static void main(String[] args) {
		System.out.println(makeReadable(86399));

	}

}
