package itbootcamp.sportistaDomaci16032020;

import java.util.Arrays;
import java.util.Scanner;

public class KlubDomaci {
	/*
	 * Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa
	 * Sportista. Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
	 * Napisati metodu koja ce ispisati ceo objekat klase klub. 
	 */
	
	private String nazivKluba;
	private String sedisteKluba;
	private int godOsnivanja;
	private SportistaDomaci[] nizSportista;
	
	int pozicija;
	
	
	public KlubDomaci(String nazivKluba, String sedisteKluba, int godOsnivanja) {
		super();
		this.nazivKluba = nazivKluba;
		this.sedisteKluba = sedisteKluba;
		this.godOsnivanja = godOsnivanja;
		this.pozicija = pozicija;
		nizSportista=new SportistaDomaci[5];
	}



	public String getNazivKluba() {
		return nazivKluba;
	}

	public String getSedisteKluba() {
		return sedisteKluba;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public SportistaDomaci[] getNizSportista() {
		
		return nizSportista;
	}

	public void setNazivKluba(String nazivKluba) {
		this.nazivKluba = nazivKluba;
	}
	
	
	
	public void punjenjeNizaSportista(SportistaDomaci sportista) {	
		nizSportista[pozicija] = sportista;
		pozicija++;
		
	}
	
	public void ispisiNizSportista(SportistaDomaci[] nizS) {
		for (int i = 0; i < nizS.length; i++) {
			if(i<nizS.length-1) {
			System.out.println(nizS[i] + ",  ");
			} else {
				System.out.println(nizS[i]);
			}
		}
	}
	
	public void ispisiKlub() {
		System.out.println("Klub: "+getNazivKluba()+", sa sedistem: "+getSedisteKluba()+", osnovan: "+getGodOsnivanja()+". godine, cine sledeci sportisti: ");
		ispisiNizSportista(nizSportista);
		
	}


}
