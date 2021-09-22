package Oppgave2Updated;

import java.util.concurrent.ThreadLocalRandom;

public class Servitorer extends Thread{

	private HamburgerBrett brett;
	private String navn;
	
	public Servitorer(HamburgerBrett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}

	int tid = ThreadLocalRandom.current().nextInt(2000, 6000);
	
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(this.tid);
			} catch (InterruptedException e) {
			}
			synchronized(this.brett) {
				while(brett.brettet.size() < 1) {
					System.out.println(navn + " (servitor) vil ta flere burgere, men brettet er full, venter!");
					try{
						this.brett.wait();
					} catch (InterruptedException ie) {}
				}
				System.out.println(navn + " (serivtor) tar burger " + brett.fjern() + ". Brett: " + brett.toList());
				this.brett.notifyAll();
			}
		}
	}
		
	

}
