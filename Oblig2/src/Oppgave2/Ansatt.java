package Oppgave2;

public class Ansatt {

	private String navn;
	private String etternavn;
	private String stilling;
	private Integer lonn;
	private Kjonn kjonn;
	
	public Ansatt(String navn, String etternavn, Kjonn kjonn, String stilling, Integer lonn) {
		this.navn = navn;
		this.etternavn = etternavn;
		this.kjonn = kjonn;
		this.stilling = stilling;
		this.lonn = lonn;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public String getStilling() {
		return stilling;
	}
	public void setStilling(String stilling) {
		this.stilling = stilling;
	}
	public int getLonn() {
		return lonn;
	}
	public void setLonn(int lonn) {
		this.lonn = lonn;
	}
	@Override
	public String toString() {
		return "Ansatt: [" + navn + ", " + etternavn + ", " + kjonn + ", " + stilling + ", " + lonn + "]";
	}
	public Kjonn getKjonn() {
		return kjonn;
	}
	public void setKjonn(Kjonn kjonn) {
		this.kjonn = kjonn;
	}

}
