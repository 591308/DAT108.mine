package Oppgave2;

public class Ansatt {

	
	private int lonn;
	private String fornavn;
	private String etternavn;
	private Kjonn kjonn;
	private String stilling;

	public Ansatt(String fornavn, String etternavn, Kjonn kjonn, String stilling, int lonn) {
		this.setFornavn(fornavn);
		this.setEtternavn(etternavn);
		this.setKjonn(kjonn);
		this.setStilling(stilling);
		this.lonn = lonn;
	}

	public int getLonn() {
		return lonn;
	}

	public int setLonn(int lonn) {
		return this.lonn = lonn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public Kjonn getKjonn() {
		return kjonn;
	}

	public void setKjonn(Kjonn kjonn) {
		this.kjonn = kjonn;
	}

	public String getStilling() {
		return stilling;
	}

	public void setStilling(String stilling) {
		this.stilling = stilling;
	}

	@Override
	public String toString() {
		return "Ansatt [" + fornavn + ", " + etternavn + ", " + kjonn
				+ ", " + stilling  + ", " + lonn  + "]";
	}
	

}
