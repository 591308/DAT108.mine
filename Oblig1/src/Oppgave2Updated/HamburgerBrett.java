package Oppgave2Updated;

public class HamburgerBrett {

	public int kapasitet;
	public int count;
	public Kokk kokk;
	public Servitorer servitor;
	public Hamburger burger;
	
	public HamburgerBrett(int kapasitet) {
		this.kapasitet = kapasitet;
	}

	public boolean erFull() {
		if(kapasitet == count) {
			return true;
		} else {
			return false;
		}
	}
	public void leggTil(Hamburger burger) {
		this.burger = burger;
	}

	public void fjern() {
		burger.count--;
	}
}
