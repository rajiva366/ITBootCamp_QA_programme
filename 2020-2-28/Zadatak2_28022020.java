package ivanaRajcic.domaci;

import java.util.Scanner;

public class Zadatak2_28022020 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije 0 - Izlaz iz programa 1 - dodavanje cene
		 * proizvoda na racun (ubacivanje u potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna.
		 * 
		 * Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se
		 * ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
		 * 
		 * Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se
		 * kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.
		 */

		Scanner sc = new Scanner(System.in);
		int opcija;
		double racun=0;
		double cenaProizvoda;
		double novacZaPlacanje;
		double kusur;
		do {
			System.out.println("Izaberite opciju iz menija:");
			System.out.println("0 - Izlaz iz programa");
			System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
			System.out.println("2 - naplata racuna");
			opcija = sc.nextInt();

			switch (opcija) {
			case 0:
				System.out.println("Izlaz iz programa");
				break;
			case 1:
				do {
				System.out.println("Unesite cenu proizvoda. Unos je moguce vrsiti sve dok ne unesete 0");
				cenaProizvoda =sc.nextDouble();
				racun=racun+cenaProizvoda;
				System.out.println("Vas ukupan racun je "+racun+" dinara");
				}while (cenaProizvoda!=0);
				break;
			case 2:
				System.out.println("Unesite iznos novca za naplatu racuna: ");
				novacZaPlacanje=sc.nextDouble();
				if (novacZaPlacanje>=racun) {
					kusur=novacZaPlacanje-racun;
					System.out.println("Vas kusur je "+ kusur+" dinara");
					racun=0;
				}else {
					System.out.println("Iznos vaseg racuna je veci od novca raspolozivog za placanje");
					
				}break;
			}

		} while (opcija != 0);
	}

}
