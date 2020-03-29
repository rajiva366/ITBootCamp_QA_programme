
public class Bicikli {
	/*
	 * Bicikli poseduje pedale(g/s), menjac(g/s) i brzinu. Brzina mo�e da se
	 * pove�ava ubrzanim okretanjem pedala I smanjuje kocenjem (kreirati dve
	 * metode). Napisati metodu koja vraca String oblika: Bickli ima menjac brzina
	 * bicikla je brzina.
	 * 
	 * MountainBike je bicikli koji dodatno ima podesavanje visine sedista. Visina
	 * sedista moze da se podesi na neku vrednost I da se dohvati. Napisati metodu
	 * koja vraca String: Bickli ima menjac brzina bicikla je brzina visina sedi�ta
	 * je visinaSedista.
	 * 
	 * U Glavnom programu kreirati Mauntinbike koji ima 3 brzine, bzinu od 100km/h I
	 * visinu sedista podesenu na 25cm. Ispisati u konzoli ovaj Mauntinbike.
	 * 
	 */

	private int menjac;
	private int brzina;

	public Bicikli(int menjac, int brzina) {
		super();
		this.menjac = menjac;
		this.brzina = brzina;
	}

	public int getMenjac() {
		return menjac;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setMenjac(int menjac) {
		if (menjac > 0) {
			this.menjac = menjac;
		}
	}

	public void setBrzina(int brzina) {
		if (brzina>=0) {
		this.brzina = brzina;
		}
	}

    // brzina se povecava za neku vrednost i smanjuje za neku vrednost a ne za 1. 
    //potrebno je dodati parametar u metod i za njega smanjiti ili povecati brzinu. 
	public void povecajBrzinu() {
		brzina++;
	}
    
	public void smanjiBrzinu() {
		if (brzina < 0) {
			brzina--;
		} else {
			System.out.println("Brzina je na minimumu");
		}
	}

	public void ispisiBicikli() {
		System.out.println("Bicikli ima menjac sa " + getMenjac()+ " brzina.\n" + "Brzina bicikla je " + getBrzina());
	}
	//nisam imala vremena da ispitam zasto mi toString ne radi, bar kod mene nista ne izbacuje pa sam zato svuda stavljala metodu ispisi... kao zamena
	
	public String toString() {
		return "Bicikli ima menjac sa " + menjac + " brzina.\n" + "Brzina bicikla je " + brzina+".";
	}

}
