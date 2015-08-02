package Rozdzial7;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		set.add("Gosling");
		set.add("da Vinci");
		set.add("van Gogh");
		set.add("Java to Go");
		set.add("Darwin");
		System.out.printf("Nasz zbior zawiera %d elementw.%n",set.size());	
		System.out.println("Najmniejszym alfabetycznie elementem jest"+set.first());
		System.out.println("Dostepne sa "+set.tailSet("k").toArray().length+" elementy wieksze od \"k\"");
		
		set.forEach(s->System.out.println(s));

	}

}
