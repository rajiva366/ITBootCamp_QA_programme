
public class Glumac extends Zaposleni{
	
	private String nazivUloge;

	public Glumac(String imePrezime, Pozoriste pozor, String nazivUloge) {
		super(imePrezime, pozor);
		this.nazivUloge = nazivUloge;
	}

	public String getNazivUloge() {
		return nazivUloge;
	}
	
	public String toString() {
		return "Glumac: "+nazivUloge+"_"+getImePrezime()+"["+getPozor().getNaziv()+"]";
	}

}
