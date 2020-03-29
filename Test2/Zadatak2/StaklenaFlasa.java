
public class StaklenaFlasa extends Flasa {
	/*
	 * Staklena fla�a pi�a je fla�a pi�a kod koje se cena sa kaucijom ra�una tako
	 * �to se na cenu bez kaucije doda 5% od cene ukoliko je zapremina manja od
	 * 0,5l, ili se doda 10% od cene ukoliko je zapremina va�a ili jednaka od 0,5l.
	 * Na glavnom ekranu se ispisuje fla�a � staklena.
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
