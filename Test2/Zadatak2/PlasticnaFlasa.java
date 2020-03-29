
public class PlasticnaFlasa extends Flasa{
	/* Plasti�na fla�a je fla�a gde je cena sa kaucijom
	 * jednaka ceni bez kaucije. Na glavnom izlazu se ispisuje fla�a � plasti�na.
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
