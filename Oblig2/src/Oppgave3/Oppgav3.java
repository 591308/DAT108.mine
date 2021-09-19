package Oppgave3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import Oppgave2.Ansatt;
import Oppgave2.Kjonn;

public class Oppgav3 {

	public static void main(String[] args) {
		List<Ansatt> ansatte = Arrays.asList(
				new Ansatt("Charles", "Dickens", Kjonn.MANN, "Programmer", 500000),
				new Ansatt("Lewis", "Carroll", Kjonn.MANN, "Utvikler", 600000),
				new Ansatt("Thomas", "Carlyle", Kjonn.MANN, "Rørligger", 300000),
				new Ansatt("Charlotte", "Bronte", Kjonn.KVINNE, "Stripper", 900000),
				new Ansatt("Matthew", "Arnold", Kjonn.KVINNE, "Designer", 550000),
				new Ansatt("Lara", "Croft", Kjonn.KVINNE, "Sjef", 550000),
				new Ansatt("Sheldon", "Cooper", Kjonn.KVINNE, "Designer", 550000));
		
		//Oppgave3a
		List<String> etternavnene = ansatte.stream().map(p-> p.getEtternavn()).collect(Collectors.toList());
		System.out.println("Liste med kun etternavnene" + etternavnene);
		
		//Oppgave3b
		int antall = ansatte.stream().filter(p -> p.getKjonn() == Kjonn.KVINNE).collect(Collectors.toList()).size();
		System.out.println("\nAntall kvinner blant ansatte:" + antall);
		
		//Oppgave3c
		List<Ansatt> kvinner = ansatte.stream().filter(p -> p.getKjonn() == Kjonn.KVINNE).collect(Collectors.toList());
		Double gjennLonnK = kvinner.stream().collect(Collectors.averagingDouble(Ansatt::getLonn));
		System.out.println("\nGjennomsnittslonn mellom kvinnene: "+ Math.round(gjennLonnK));
		
		//Oppgave3d
		List<Ansatt> alleMedSjef = ansatte.stream().filter(e-> "Sjef".equalsIgnoreCase(e.getStilling())).collect(Collectors.toList());
		Consumer<? super Ansatt> okLonn = e-> e.setLonn(e.getLonn()/(7*100) + e.getLonn());
		alleMedSjef.forEach(okLonn);
		System.out.println("\nAnsatte etter lønnøkning: ");
		skrivUtAlle(ansatte); 
		
		//Oppgave3e
		
		
		
	}
	
	
	//skriver ut alle ansatte
	private static void skrivUtAlle(List<Ansatt> ansatte) {
		ansatte.forEach(p -> System.out.println(p));
	}
}
