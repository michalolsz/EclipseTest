package rozdzial9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Hero{
	public String nazwa;
	public int wiek;
	public Hero(String nazwa,int wiek){
		this.nazwa=nazwa;
		this.wiek=wiek;
	}
}

public class Stream {

	public static void main(String[] args) {
		Hero[] bohatery={
				new Hero("ASsda",10),
				new Hero("casas",12),	
				new Hero("fefas",6),
				new Hero("hfght",7),
				new Hero("bsdsa",10),
				new Hero("dsasada",16),
				new Hero("edsada",9),
				new Hero("ggsda",8)			
		};
		int sumalat=Arrays.stream(bohatery).filter(b->b.wiek>=10).mapToInt(b->b.wiek).sum();
		System.out.println("Suma lat bohaterow powyzej 9 lat to "+sumalat);
		List<Hero> sorted=Arrays.stream(bohatery).sorted((h1,h2)->h1.nazwa.compareTo(h2.nazwa)).collect(Collectors.toList());
		sorted.forEach(s->System.out.println(s.nazwa));
		

	}
	
	

}
