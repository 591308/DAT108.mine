package Oppgave2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Oppgave2 {

final static int FASTTILLEGG = 59999;
final static int TILLEGG = 30000;
	
	public static void main(String[] args) {
		
		List<Ansatt> ansatte = Arrays.asList(
				new Ansatt("Charles", "Dickens", Kjonn.MANN, "Programmer", 500000),
				new Ansatt("Lewis", "Carroll", Kjonn.MANN, "Utvikler", 600000),
				new Ansatt("Thomas", "Carlyle", Kjonn.MANN, "R�rligger", 300000),
				new Ansatt("Charlotte", "Bronte", Kjonn.MANN, "Stripper", 800000),
				new Ansatt("Matthew", "Arnold", Kjonn.KVINNE, "Designer", 550000),
				new Ansatt("Amalie", "Libia", Kjonn.KVINNE, "Designer", 400000),
				new Ansatt("Neia", "Sponge", Kjonn.KVINNE, "Designer", 100000));
		
		
		skrivUtAlle(ansatte); //skriver ut alle ansatte
	
		Function<Ansatt, Integer> hentLonn = a -> a.getLonn() + FASTTILLEGG;
		
		Function<Ansatt, Integer> prosentTillegg = a-> (a.getLonn()*7)/100 + a.getLonn();
		
		Function<Ansatt, Integer> fastKTLavLonn = a -> { 
			if(a.getLonn() < 500000) { 
				return a.getLonn() + TILLEGG;
			}
			return a.getLonn();
		};
		
		Function<Ansatt, Integer> prosentTMan = a -> {
			if(a.getKjonn() == Kjonn.MANN) {
				return (a.getLonn()*15)/100 + a.getLonn();
			} return a.getLonn();
		};
		
		//I (???) sette inn funksjon
		lonnsoppgjor(ansatte, hentLonn);
		System.out.println("");
		skrivUtAlle(ansatte);
		
	}

	private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> function) {
		for(Ansatt a: ansatte) {
			a.setLonn(function.apply(a));
		}
	}

	private static void skrivUtAlle(List<Ansatt> ansatte) {
		ansatte.forEach(p -> System.out.println(p));
	}
}
