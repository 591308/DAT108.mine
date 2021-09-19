package oppgave1;

import javax.swing.JOptionPane;

public class inPut extends Thread {

	boolean fortsette = true;
	
	public void stopp() {
		fortsette = false;
	}
	
	public void run() {
		while(this.fortsette) {
			String temp = JOptionPane.showInputDialog("Skriv inn ordet som skal vises, skriv 'stopp' for å avslutte:");
			outPut.tekst = temp;
			if(temp.toLowerCase().compareTo("stopp") == 0) {
				this.fortsette = false;
				outPut.fortsette = false;
			}
			try {
				Thread.sleep(100L);
			} catch (InterruptedException e) {
			}
		}
	}
}
