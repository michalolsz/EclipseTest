package Rozdzial7;

import java.util.ArrayList;
import java.util.List;

public class ZamianaKolekcjiNaTablice {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("bbbbb");
		list.add("ccccc");
		list.add("ddddd");
		String[] sl=(String[])list.toArray(new String[0]);
		System.out.println(sl.length);

	}

}
