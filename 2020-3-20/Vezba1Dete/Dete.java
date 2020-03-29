
public class Dete {

	/*
	 * 1. Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da
	 * se kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili
	 * metoda oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce
	 * ispisivati broj klikera i metodu koja ispisuje prosecan broj decjih
	 * godina(ako imamo troje dece, broj prosecnih godina za njih troje; ako imamo
	 * dvoje racunamo prosecne godine za to dvoje) .
	 * 
	 */
	
	private String ime;
	private String prezime;
	private int brojGodina;
	private int brojKlikera;
	private static int ukupanBrojGodina;
	private static int ukupanBrojKlikera;
	private static int ukupanBrDece;
	
	public Dete(String ime, String prezime, int brojGodina, int brojKlikera) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojGodina = brojGodina;
		this.brojKlikera = brojKlikera;
		ukupanBrojGodina=ukupanBrojGodina+this.brojGodina;
		ukupanBrojKlikera=ukupanBrojKlikera+this.brojKlikera;
		ukupanBrDece ++;
	}
	
	public void dodajKliker() {
		brojKlikera++;
		ukupanBrojKlikera++;
	}
	
	public void oduzmiKliker() {
		brojKlikera--;
		ukupanBrojKlikera--;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getBrojGodina() {
		return brojGodina;
	}

	public int getBrojKlikera() {
		return brojKlikera;
	}

	public static int getUkupanBrojGodina() {
		return ukupanBrojGodina;
	}

	public static int getUkupanBrojKlikera() {
		return ukupanBrojKlikera;
	}
	
	public String toString() {
		return getIme()+" "+getPrezime();
	}

	public void ispisiBrKlikera() {
		System.out.println(getIme()+" ima "+brojKlikera+" klikera, a ukupan broj klikera sve dece je "+ukupanBrojKlikera);
	}
	
	public static void ispisiProsecanBrojGodinaDece() {
		System.out.println("Ukupan broj dece je "+ukupanBrDece);
		System.out.println("Prosecan broj godina dece je: "+ukupanBrojGodina/ukupanBrDece);
	}

	public static void main(String[] args) {
		Dete d1 = new Dete("Mali", "Kreza", 8, 12);
		System.out.println("Broj klikera deteta "+d1+" je "+d1.getBrojKlikera());
		System.out.println("Broj godina deteta "+d1+" je "+d1.getBrojGodina());
		System.out.println("Ukupan broj klikera: "+getUkupanBrojKlikera());
		System.out.println("Ukupan broj godina: "+getUkupanBrojGodina());
		d1.ispisiBrKlikera();
		ispisiProsecanBrojGodinaDece();
		System.out.println(" ");
		Dete d2 = new Dete("Maja", "Pcelica", 12, 18);
		System.out.println("Broj klikera deteta "+d2+"je "+d2.getBrojKlikera());
		System.out.println("Broj godina deteta "+d2+"je "+d2.getBrojGodina());
		System.out.println("Ukupan broj klikera: "+getUkupanBrojKlikera());
		System.out.println("Ukupan broj godina: "+getUkupanBrojGodina());
		d2.ispisiBrKlikera();
		ispisiProsecanBrojGodinaDece();
		System.out.println(" ");
		
		
		d1.dodajKliker();
		System.out.println("Broj klikera deteta "+d1+" je "+d1.getBrojKlikera());
		System.out.println("Ukupan broj klikera: "+getUkupanBrojKlikera());
		System.out.println(" ");
		
		
	}
	
	
	
	
	
	
	

}
