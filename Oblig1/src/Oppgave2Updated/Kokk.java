package Oppgave2Updated;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Kokk {

	private HamburgerBrett brett;
	private String navn;
	private int kapasitet = 4;
	
	public Kokk(HamburgerBrett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}

	int tid = ThreadLocalRandom.current().nextInt(500, 2000);
	
	static LinkedList<Integer> burgerKo = new LinkedList<>();
	
	public void start(){
		int brettet = 1;
		while(true) {
			try {
				Thread.sleep(tid);
			} catch (InterruptedException e) {}
			
			synchronized(brett) {
				while(this.burgerKo.size() == kapasitet) {
					System.out.println(navn + " (cook) wants to add hamburger, but the board is full. Waiting.");
					try {
						brett.wait();
					} catch (InterruptedException e) {}
				}
				
				this.burgerKo.add(Integer.valueOf(brettet));
				brett.count++;
				System.out.println(navn + " (kokk) legger til burger " + brettet + ". Brett: " + brett.count);
				brettet++;
				brett.notifyAll();
			}
		}
	}


}
