
public class PlasticnaFlasa extends Flasa{
	/* Plastièna flaša je flaša gde je cena sa kaucijom
	 * jednaka ceni bez kaucije. Na glavnom izlazu se ispisuje flaša – plastièna.
	 */
	
	private double cenaSaKaucijom;

	

	public PlasticnaFlasa(String nazivPica, double cenaBezKaucije, double zapremina) {
		super(nazivPica, cenaBezKaucije, zapremina);
		this.cenaSaKaucijom=cenaBezKaucije;
	}



	public double getCenaSaKaucijom() {
		return cenaSaKaucijom;
	}
	
	public void ispisiPlasticnu() {
		ispisiFlasu();
		System.out.println("flasa -plasticna");
	}
	
	@Override
	public String toString() {
		return super.toString()+"-plasticna";
	}




	
	

}
