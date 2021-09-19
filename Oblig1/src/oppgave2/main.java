package oppgave2;

import java.util.Arrays;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		final String[] kokker= {"Anne", "Erik", "Knut"};
		final String[] servitorer= {"Mia", "Per"};
		final int KAPASITET= 4;
		
		skrivUtHeader(kokker, servitorer, KAPASITET);
		
		Thread kokk1 = new Kokk();
	    kokk1.setName("Anne (Kokk)");
	    Thread kokk2 = new Kokk();
	    kokk2.setName("Erik (Kokk)");
	    Thread kokk3 = new Kokk();
	    kokk3.setName("Knut (Kokk)");
	    Thread Servitor1 = new Servitor();
	    Servitor1.setName("Mia (Servit)");
	    Thread Servitor2 = new Servitor();
	    Servitor2.setName("Per (Servit)");
	    kokk1.start();
	    Servitor1.start();
	    kokk2.start();
	    kokk3.start();
	    Servitor2.start();
	    kokk1.join();
	    Servitor1.join();
	    kokk2.join();
	    kokk3.join();
	    Servitor2.join();}
	    

	private static void skrivUtHeader(String[] kokker, String[] servitorer, int KAPASITET) {
		
		System.out.println("I denne simuleringen har vi");
		System.out.println("\t" + kokker.length + " kokker " + Arrays.toString(kokker));
		System.out.println("\t" + servitorer.length + " servitører " + Arrays.toString(servitorer));
		System.out.println("Kapasiteten til bretter er " + KAPASITET + " hamburgere");
		System.out.println("Vi starter...");
	}
}


