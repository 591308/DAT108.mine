package Oppgave2;

public class Hamburger {

	public int burgerID;
	public int burgerCount;
	
	public Hamburger(int burgerCount) {
		this.burgerID = burgerCount;
	}

	public int getBurgerID() {
		return burgerID;
	}

	public void setBurgerID(int burgerID) {
		this.burgerID = burgerID;
	}

	public int getBurgerCount() {
		return burgerCount;
	}

	public void setBurgerCount(int burgerCount) {
		this.burgerCount = burgerCount;
	}
}
