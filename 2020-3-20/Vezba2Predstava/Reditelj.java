
public class Reditelj extends Zaposleni{
	
	private String nadimakReditelja;

	public Reditelj(String imePrezime, Pozoriste pozor, String nadimakReditelja) {
		super(imePrezime, pozor);
		this.nadimakReditelja = nadimakReditelja;
	}

	public String getNadimakReditelja() {
		return nadimakReditelja;
	}
	
	public String toString() {
		return "Reditelj: "+nadimakReditelja+"_"+getImePrezime()+"["+getPozor().getNaziv()+"]";
	}

}
