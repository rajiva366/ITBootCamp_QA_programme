
public class StaklenaFlasa extends Flasa {
	/*
	 * Staklena flaša piæa je flaša piæa kod koje se cena sa kaucijom raèuna tako
	 * što se na cenu bez kaucije doda 5% od cene ukoliko je zapremina manja od
	 * 0,5l, ili se doda 10% od cene ukoliko je zapremina vaæa ili jednaka od 0,5l.
	 * Na glavnom ekranu se ispisuje flaša – staklena.
	 */

	private double cenaSaKaucijom;

	public StaklenaFlasa(String nazivPica, double cenaBezKaucije, double zapremina) {
		super(nazivPica, cenaBezKaucije, zapremina);
		if (zapremina < 0.5) {
			this.cenaSaKaucijom = cenaBezKaucije * 1.05;
		} else {
			this.cenaSaKaucijom = cenaBezKaucije * 1.1;
		}
	}
	
	
	
	public double getCenaSaKaucijom() {
		return cenaSaKaucijom;
	}



	public void ispisiStaklenu() {
		ispisiFlasu();
		System.out.println("flasa -staklena");
	}
	
	@Override
	public String toString() {
		return super.toString()+"-staklena";
	}

}
