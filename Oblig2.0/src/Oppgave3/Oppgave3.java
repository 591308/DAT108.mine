package Oppgave3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import Oppgave2.Ansatt;
import Oppgave2.Kjonn;

public class Oppgave3 {

	public static void main(String[] args) {
		
			List<Ansatt> ansatte = Arrays.asList(
					new Ansatt("Charles", "Dickens", Kjonn.MANN, "Programmer", 500000),
					new Ansatt("Lewis", "Carroll", Kjonn.MANN, "Utvikler", 600000),
					new Ansatt("Thomas", "Carlyle", Kjonn.MANN, "Rorligger", 300000),
					new Ansatt("Charlotte", "Bronte", Kjonn.KVINNE, "Stripper", 100000),
					new Ansatt("Matthew", "Arnold", Kjonn.KVINNE, "Designer", 800001),
					new Ansatt("Lara", "Croft", Kjonn.KVINNE, "Sjef", 550000),
					new Ansatt("Sheldon", "Cooper", Kjonn.KVINNE, "Designerr", 400000));
			
			//Oppgave3a
			
			System.out.println("Liste med kun etternavnene" + 
					ansatte.stream().map(p-> p.getEtternavn()).collect(Collectors.toList()));
			
			//Oppgave3b
			System.out.println("\nAntall kvinner blant ansatte:" + ansatte.stream().filter(p -> p.getKjonn() == Kjonn.KVINNE).collect(Collectors.toList()).size());
			
			//Oppgave3c
			System.out.println("\nGjennomsnittslonn mellom kvinnene: "+ 
					Math.round(ansatte.stream().filter(p -> p.getKjonn() == Kjonn.KVINNE).collect(Collectors.averagingDouble(Ansatt::getLonn))));
			
			//Oppgave3d
			List<Ansatt> alleMedSjef = ansatte.stream().filter(e-> "Sjef".equalsIgnoreCase(e.getStilling())).collect(Collectors.toList());
			Consumer<? super Ansatt> okLonn = e-> e.setLonn(e.getLonn()/(7*100) + e.getLonn());
			alleMedSjef.forEach(okLonn);
			System.out.println("\nAnsatte etter lonnkning: ");
			skrivUtAlle(ansatte); 
			
			//Oppgave3e
			System.out.println("\n(True|False) om noen ansatt tjener over 800000: " + ansatte.stream().filter(e -> e.getLonn() > 800000).iterator().hasNext());
			
			//Oppgave3f
			System.out.println("\nSkriver ut alle aansatte utan lokke: ");
			ansatte.forEach(System.out::println);
			
			//Oppgave3g
			System.out.println("\nFinn dei ansatte med lavest lonn: ");
			ansatte.stream().filter(p-> p.getLonn() < 500000).map(p -> p).collect(Collectors.toList()).forEach(System.out::println);
			
			//Oppgave3h
			System.out.println("\nSum av alle tallene fra 1 til 1000 som er delelig med 3 og 5: " + 
					IntStream.range(1, 1000).filter(i -> i%3==0||i%5==0).sum());
			
		}
		
		//skriver ut alle ansatte
				private static void skrivUtAlle(List<Ansatt> ansatte) {
					ansatte.forEach(p -> System.out.println(p));
				}

}
