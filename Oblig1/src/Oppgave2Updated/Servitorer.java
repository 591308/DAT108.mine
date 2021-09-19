package Oppgave2Updated;

import java.util.concurrent.ThreadLocalRandom;

public class Servitorer {

	private static final Hamburger burger = null;
	private HamburgerBrett brett;
	private String navn;
	
	public Servitorer(HamburgerBrett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}

	int tid = ThreadLocalRandom.current().nextInt(500, 2000);

	
	public void start() {

		while(true) {
			try {
				Thread.sleep(this.tid);
			} catch (InterruptedException e) {
			}
			synchronized(brett) {
				while(Kokk.burgerKo.size() == 0) {
					try{
						this.wait();
					} catch (InterruptedException ie) {}
				}
				Kokk.burgerKo.removeFirst();
				brett.count--;
				brett.fjern();
				System.out.println(navn + " (kokk) legger til burger " + brett.count + ". Brett: " + brett.count);
				brett.notifyAll();
			}
		}
	}
		
	

}
