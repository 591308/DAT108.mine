package oppgave2;

public class Kokk extends Thread{
	
	static final HamburgerBrett brett = new HamburgerBrett();
	
	public synchronized void run() {
		try {
			brett.legTilBurger();
		} catch (InterruptedException ie) {}
	}
}
