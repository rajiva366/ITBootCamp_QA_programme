package itbootcamp.ucionicaDomaci17032020;

import java.util.ArrayList;

public class Laptop {

	/*
	 * Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju
	 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji
	 * koriste laptop moze da se prosiri i da se smanji. Moze da se ispise u obliku
	 * (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
	 */

	private ArrayList<Polaznik> listaPolaznika;
	private String marka;

	public Laptop(String marka) {
		listaPolaznika = new ArrayList<Polaznik>();
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	public void prosiritiListu(Polaznik p) {
		listaPolaznika.add(p);
	}

	public void smanjitiListu(Polaznik p) {
		listaPolaznika.remove(p);
	}

	public void ispisiPolaznike() {
		for (int i = 0; i < listaPolaznika.size(); i++) {
			if (i < listaPolaznika.size() - 1) {
				System.out.print(listaPolaznika.get(i).toString() + ", ");
			} else {
				System.out.print(listaPolaznika.get(i));
			}
		}
	}

	public void ispisiLaptop() {
		System.out.print(getMarka().toUpperCase()+"{");
		ispisiPolaznike();
		System.out.println("}");
	}

}
