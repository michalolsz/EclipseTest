package Rozdzial7;

import java.util.ArrayList;

public class ListaForEach {

	public static void main(String[] args) {
		ArrayList<String> test=new ArrayList<>();
		test.add("aaaa");
		test.add("bbbb");
		test.add("cccc");
		
		test.forEach(s->System.out.println(s));

	}

}
