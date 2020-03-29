package itbootcamp.sportisti;

import java.util.Scanner;

public class Sportista {
//	Napisati klasu Sportista. Sportista ima
//	1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
//	2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
//	3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
//	4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje moze i da se dohvati ida se postavi.
//	Napisati glavni program koji kreira tri igraca. 
//	U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.

	private String ime;
	private String prezime;
	private String sport;
	private String klub;
	public int broj;
	
	public String dohvatiIme() {
		return ime;
	}
	
	public String dohvatiPrezime() {
		return prezime;
	}
	
	public String dohvatiSport () {
		return sport;
	}
	
	public String dohvatiKlub() {
		return klub;
	}
	
	public String promeniKlub (Sportista sp) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi novi klub: ");
		String novKlub;
		novKlub=sc.nextLine();
		sp.klub= novKlub;
		return sp.klub;
	
	}
	
	
	
	public int postaviBroj(Sportista sp) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi novi broj: ");
		sp.broj=sc.nextInt();
		return sp.broj;
	}
	
	public Sportista() {
		
	}
	
	public Sportista(String i, String pr, String sp, int br, String kl) {
		ime=i;
		prezime=pr;
		sport=sp;
		broj=br;
		klub= kl;
	}
	
	public void ispisiSportistu() {
		System.out.println("Sportista: "+dohvatiIme()+" "+ dohvatiPrezime()+" sa brojem: "+broj+", bavi se sportom: "+dohvatiSport()+" i igra za klub: "+dohvatiKlub());
	}
	
	
	
	
	
}
