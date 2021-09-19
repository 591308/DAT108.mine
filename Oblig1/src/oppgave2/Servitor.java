package oppgave2;

public class Servitor extends Thread{

	public synchronized void run() {
		try {
			Kokk.brett.fjernBurger();
		} catch (InterruptedException e) {
		}
	}
}
