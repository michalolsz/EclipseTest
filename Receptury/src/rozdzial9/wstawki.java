package rozdzial9;

interface a{
	default String filter(String s){
		return "Przefiltrowano "+s;
	}
}
interface b{
	default String convolve(String s){
		return "Zwinieto "+s;
	}
}

public class wstawki implements a,b {

	public static void main(String[] args) {
		System.out.println(new wstawki().process("chuj"));

	}
	private String process(String s){
		return filter(convolve(s));
	}

}
