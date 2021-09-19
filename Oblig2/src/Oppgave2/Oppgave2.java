package Oppgave2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Oppgave2 {

	final static int FASTTILLEGG = 59999;
	
	public static void main(String[] args) {
		
		List<Ansatt> ansatte = Arrays.asList(
				new Ansatt("Charles", "Dickens", Kjonn.MANN, "Programmer", 500000),
				new Ansatt("Lewis", "Carroll", Kjonn.MANN, "Utvikler", 600000),
				new Ansatt("Thomas", "Carlyle", Kjonn.MANN, "Rørligger", 300000),
				new Ansatt("Charlotte", "Bronte", Kjonn.MANN, "Stripper", 800000),
				new Ansatt("Matthew", "Arnold", Kjonn.KVINNE, "Designer", 550000));
		
		
		skrivUtAlle(ansatte); //skriver ut alle ansatte
	
		Function<Ansatt, Integer> hentLonn = a -> a.getLonn();
//		Function<Ansatt, Integer> prosentTillegg = a-> a.setLonn(a.getLonn() * 10/100);
//		Function<Ansatt, Integer> fastKTLavLonn = 
//		Function<Ansatt, Integer> prosentTMan = 
		
		
		lonnsoppgjor(ansatte, hentLonn);
		System.out.println("");
		skrivUtAlle(ansatte);
		
	
		
		
	}

	private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> function) {
		for(Ansatt a: ansatte) {
			function.apply(a);
		}
	}

	private static void skrivUtAlle(List<Ansatt> ansatte) {
		ansatte.forEach(p -> System.out.println(p));
	}

}
