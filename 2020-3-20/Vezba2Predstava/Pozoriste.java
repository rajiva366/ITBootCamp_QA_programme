
public class Pozoriste {
	
	private static int idPozoriste;
	private String naziv;
	
	
	public Pozoriste(String naziv) {
		super();
		this.naziv = naziv;
		idPozoriste++;
	}




	public static int getIdPozoriste() {
		return idPozoriste;
	}




	public String getNaziv() {
		return naziv;
	}




	public void ispisiPozoriste() {
		System.out.println(naziv + "["+idPozoriste+"]");
	}
	
	
	
	

}
