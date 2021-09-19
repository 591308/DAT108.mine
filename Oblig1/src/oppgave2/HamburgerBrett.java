package oppgave2;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class HamburgerBrett {

	static boolean stopp = true;
	private int kapasitet = 4;

	public void stop() {
		stopp = false;
	}


	int tid = ThreadLocalRandom.current().nextInt(2000, 6000);
	
      
	LinkedList<Integer> burgerKo = new LinkedList<>(); 
	
	public synchronized void legTilBurger() throws InterruptedException{
		int burgere = 1;
		while(true) {
			Thread.sleep(tid);
			while(burgerKo.size() == kapasitet) {
				try {
				System.out.println(Thread.currentThread().getName() + " klar med hamburger, men brett er fullt. Venter! ");
				burgerKo.wait();
			} catch (InterruptedException ie) {}	
				}
			
			burgerKo.add(Integer.valueOf(burgere));
			System.out.println(String.valueOf(Thread.currentThread().getName()) + " legger på " + 
					"hamburger (" + burgere + ")" + " => Brett: " + this.burgerKo.toString());
			burgere++;
			burgerKo.notifyAll();
		}
	}
	
	
	public synchronized void fjernBurger() throws InterruptedException {
		while(true) {
			Thread.sleep(tid);
			synchronized(this) {
				while(burgerKo.size() < 1) {
					try{
						System.out.println(Thread.currentThread().getName() + "(servitor) vil ta burger men brett er tom, venter!");
						burgerKo.wait();
					} catch (InterruptedException ie) {}
				}
				int ta = this.burgerKo.removeFirst().intValue();
				System.out.println(Thread.currentThread().getName() + " tar av hamburger (" + ta + ") => Brett: " + this.burgerKo.toString());
				burgerKo.notifyAll();
			}
		}
	}
}
