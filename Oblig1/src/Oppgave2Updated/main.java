package Oppgave2Updated;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		final String[] kokker = {"Anne", "Erik", "Knut"};
		final String[] servitorer = {"Mia", "Per"};
		final int KAPASITET = 4;
		
		skrivUtHeader(kokker, servitorer, KAPASITET);
		
		HamburgerBrett brett = new HamburgerBrett(KAPASITET);
		
		for(String navn: kokker) {
			new Kokk(brett, navn).start();
		}
		
		for(String navn: servitorer) {
			new Servitorer(brett, navn).start();
		}
	}

	private static void skrivUtHeader(String[] kokker, String[] servitorer, int KAPASITET) {
		System.out.println("I denne simuleringen har vi");
		System.out.println("\t" + kokker.length + " kokker " + Arrays.toString(kokker));
		System.out.println("\t" + servitorer.length + " servitører " + Arrays.toString(servitorer));
		System.out.println("Kapasiteten til bretter er " + KAPASITET + " hamburgere");
		System.out.println("Vi starter...");
		
	}

}
