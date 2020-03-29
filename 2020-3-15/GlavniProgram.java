package itbootcamp.sportisti;

import javax.annotation.PostConstruct;

public class GlavniProgram {

	public static void main(String[] args) {
		Sportista sp1= new Sportista("Milan", "Milanovic", "Odbojka", 12, "OK Vozdovac");
		Sportista sp2= new Sportista("Nenad", "Lilic", "Fudbal",0, "FK Rad");
		Sportista sp3= new Sportista("Sofija", "Mudric", "Balet", 22, "Kreativno drustvo Sloncica");
		
		System.out.println(sp1.dohvatiIme());
		System.out.println(sp1.dohvatiPrezime());
		System.out.println(sp1.broj);
		System.out.println(sp1.dohvatiKlub());
		sp1.ispisiSportistu();
		
		sp1.promeniKlub(sp1);
		sp1.ispisiSportistu();
		
		sp2.ispisiSportistu();
		sp2.postaviBroj(sp2);
		sp2.ispisiSportistu();
		
		sp3.ispisiSportistu();
		
		

	}

}
