package oppgave1;

public class outPut extends Thread {
	static boolean fortsette = true;
	
	public void stopp() {
		fortsette = false;
	}
	
	static String tekst = "Hei verden!";
	
	public void run() {
		while(fortsette) {
			System.out.println(tekst);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}
	}
}
