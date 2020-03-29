package itbootcamp.ucionicaDomaci17032020;

public class Polaznik {
	/*
	 * 1. Napraviti paket ucionica. Unutar paketa ucionica, pisati klase. Polaznik
	 * ima ime i prezime koje se zadaje prilikom kreiranja polaznika. Ime i prezime
	 * polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje u
	 * obliku: IME_PREZIME.
	 */

	/*
	 * Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju
	 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji
	 * koriste laptop moze da se prosiri i da se smanji. Moze da se ispise u obliku
	 * (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
	 */
	
	private String ime;
	private String prezime;
	
	public Polaznik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	@Override
	public String toString() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase();
	}
	
	
	
	
	

}
