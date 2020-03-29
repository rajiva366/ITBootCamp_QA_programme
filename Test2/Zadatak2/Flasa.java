
public class Flasa {
	/*
	 * Fla�a pi�a ima naziv, jednozna�ni automatski generisan indetifikator, cenu
	 * bez kaucije, zapreminu. Svi podaci se zadaju prilokom stvaranja i mogu da se
	 * dohvate, a jedino cena mo�e da se i promeni. Na glavnom izlazu se ispisuje u
	 * obliku �naziv: indetifikator, cena din, zapremina l�.
	 */
	
	/*  Staklena fla�a pi�a je
	 * fla�a pi�a kod koje se cena sa kaucijom ra�una tako �to se na cenu bez
	 * kaucije doda 5% od cene ukoliko je zapremina manja od 0,5l, ili se doda 10%
	 * od cene ukoliko je zapremina va�a ili jednaka od 0,5l. Na glavnom ekranu se
	 * ispisuje fla�a � staklena. 
	 */
	
	 /* Plasti�na fla�a je fla�a gde je cena sa kaucijom
	 * jednaka ceni bez kaucije. Na glavnom izlazu se ispisuje fla�a � plasti�na.
	 */ 
	
	 /* Glavni Program � napraviti listu plasti�nih fla�a i listu staklenih fla�a. U
	 * svaku ubaciti nekoliko objekata. Izra�unati ra�un za kupljeno pi�e, pri �emu
	 * se ra�unaju cene sa kaucijom za staklene fla�e a bez za plasti�ne. Nije
	 * potrebno koristii Scanner klasu.
	 * 
	 */
	
	private String nazivPica;
	private double cenaBezKaucije;
	private double zapremina;
	// potrebno je da postavis da je publick idFlase ili da ga povezes sa id 
	// drugom promnjeivom i napravis geter, 
	private static int idFlase;
	
	public Flasa(String nazivPica, double cenaBezKaucije, double zapremina) {
		super();
		this.nazivPica = nazivPica;
		if(cenaBezKaucije>0) {
		this.cenaBezKaucije = cenaBezKaucije;
		}else {
			System.out.println("Cena mora biti pozitivan broj");
		}
		this.zapremina = zapremina;
		idFlase++;
		
	}

	public String getNazivPica() {
		return nazivPica;
	}

	

	public double getCenaBezKaucije() {
		return cenaBezKaucije;
	}

	public double getZapremina() {
		return zapremina;
	}

	public void setCenaBezKaucije(double cenaBezKaucije) {
		if (cenaBezKaucije>0) {
		this.cenaBezKaucije = cenaBezKaucije;
		} else {
			System.out.println("Cena mora biti pozitivan broj");
		}
	}
	
	public String toString() {
		return nazivPica+": "+idFlase+", "+cenaBezKaucije+" dinara, "+zapremina +"litara";
	}
	//nisam imala vremena da ispitam zasto mi toString ne radi, bar kod mene nista ne izbacuje pa sam zato svuda stavljala metodu ispisi... kao zamena
	public void ispisiFlasu() {
		System.out.println(nazivPica+": "+idFlase+", "+cenaBezKaucije+" dinara, "+zapremina +"litara");
	}
	
	
	
	
	

}
