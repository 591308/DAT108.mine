package Oppgave2Updated;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class HamburgerBrett {

	public int kapasitet;
	public Kokk kokk;
	public LinkedList<Hamburger> brettet = new LinkedList<>();
	
	public HamburgerBrett(int kapasitet) {
		this.kapasitet = kapasitet;
	}
	int count = 1;
	public int leggTil() {
		Hamburger burger = new Hamburger(count);
		brettet.add(burger);
		count++;
		return burger.getBurgerID();
	}

	public int fjern() {
		int burger = brettet.getFirst().getBurgerID();
		brettet.removeFirst();
		return burger;
	}

	public List<Integer> toList() {
		return brettet.stream().map(a -> a.getBurgerID()).collect(Collectors.toList());
	}
	
	
}
