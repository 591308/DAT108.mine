package Oppgave2Updated;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Kokk extends Thread{

	private HamburgerBrett brett;
	private String navn;
	
	public Kokk(HamburgerBrett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}

	int tid = ThreadLocalRandom.current().nextInt(500, 2000);
	
	public void run(){
		
		while(true) {
			try {
				Thread.sleep(tid);
			} catch (InterruptedException e) {}
			synchronized(brett) {
				while(brett.brettet.size() == 4) {
					System.out.println(navn + " (kokk) vil legge til flere burgere, men brettet er full, venter!");
					try {
						brett.wait();
					} catch (InterruptedException e) {}
				}
				System.out.println(navn + " (kokk) legger til burger " + brett.leggTil() +  ". Brett: " + brett.toList());
				brett.notifyAll();
			}
		}
	}

}
