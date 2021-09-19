package oppgave1;

public class main {
	public static void main(String []args) throws InterruptedException {
		
		Thread output = new outPut();
		Thread input = new inPut();
		
		
		output.start();
		
		input.start();
		input.join();
		output.join();
		
		System.out.println("Programmet avsluttet");
	}
}
