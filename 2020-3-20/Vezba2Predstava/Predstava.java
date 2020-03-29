import java.util.ArrayList;

public class Predstava {

	private String nazivPredstave;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> listaZaposlenih;
	private int brZaposlenihNaPredstavi;
	
	public Predstava(String nazivPredstave, Pozoriste pozoriste) {
		super();
		this.nazivPredstave = nazivPredstave;
		this.pozoriste = pozoriste;
		listaZaposlenih = new ArrayList<Zaposleni>();
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	
	public void dodajZaposlenog (Zaposleni z) {
		if (z.getPozor()==pozoriste) {
		listaZaposlenih.add(z);
		brZaposlenihNaPredstavi++;}
		else {
			System.out.println("Zaposleni "+z+ ", nije iz pozorista "+pozoriste.getNaziv());
		}
	}
	
	public void izbaciZaposlenogSaPredstave (Zaposleni z) {
		listaZaposlenih.remove(z);
		brZaposlenihNaPredstavi--;
	}
	
	public int getBrZaposlenihNaPredstavi() {
		return brZaposlenihNaPredstavi;
	}
	
	public void opisPredstave() {
		System.out.println(nazivPredstave+", u pozoristu:"+pozoriste.getNaziv());
		for (int i=0;i<listaZaposlenih.size();i++) {
			System.out.println(listaZaposlenih.get(i));
		}
	}
	
	
	
}
