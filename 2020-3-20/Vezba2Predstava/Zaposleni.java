
public class Zaposleni {
	
	private String imePrezime;
	private Pozoriste pozor;
	
	public Zaposleni(String imePrezime, Pozoriste pozor) {
		super();
		this.imePrezime = imePrezime;
		this.pozor = pozor;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public Pozoriste getPozor() {
		return pozor;
	}
	
	public String toString() {
		return imePrezime+"["+pozor.getNaziv()+"]";
	}
	
	
	
	

}
