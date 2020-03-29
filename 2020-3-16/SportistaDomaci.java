package itbootcamp.sportistaDomaci16032020;

import java.util.Arrays;

public class SportistaDomaci {

	/*
	 * 1. Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina
	 * rodjenja se zadaju prilikom kreiranja i ne mogu da se promene. Sportistu
	 * ispisati u obliku: IME_PREZIME: godinaRodjenja
	 */

	/*
	 * Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa
	 * Sportista. Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
	 * Napisati metodu koja ce ispisati ceo objekat klase klub. 
	 */
	
	/*
	 * Napisati glavni program, gde cete testirati kako ove klase funkcionisu.
	 */
	
	private String ime;
	private String prezime;
	private int godinaRodj;
	
	public SportistaDomaci(String ime, String prezime, int godinaRodj) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodj = godinaRodj;
	}
	
	public SportistaDomaci () {
		
	}
	
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getGodinaRodj() {
		return godinaRodj;
	}
	
	@Override
	public String toString() {
		
		return ime.toUpperCase()+ "_"+prezime.toUpperCase()+": "+godinaRodj;
	}
	

}
