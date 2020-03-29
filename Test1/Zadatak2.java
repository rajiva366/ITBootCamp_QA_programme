import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {
		/*
		 * Ukoliko kupac kupi robu u iznosu većem od 1500 dinara, dobija 10% popusta, a
		 * ukoliko kupi robu u iznosu većem od 7000 dinara dobija 20% popusta. Napisati
		 * program koji će za uneti iznos odabrane robe ispisati koliko zapravo treba
		 * platiti.
		 */

		Scanner sc = new Scanner(System.in);

		double vrednostRobe;
		double iznosZaPlacanje = 0;

		int izbor;
		do {
			System.out.println("Unesi broj opcije koju zelis:");
			System.out.println("1. Unesi vrednost kupljene robe");
			System.out.println("0. Izadji iz programa");

			izbor = sc.nextInt();

			switch (izbor) {
			case 1:
				System.out.println("Unesi vrednost kupljene robe:");
				vrednostRobe = sc.nextDouble();

				if (vrednostRobe > 1500) {
					if (vrednostRobe < 7000) {
						iznosZaPlacanje = vrednostRobe * 0.9;
						
					} else {
						iznosZaPlacanje = vrednostRobe * 0.8;
					}
					System.out.println("Iznos koji treba da platite je: " + iznosZaPlacanje + " dinara");
				} else {
					if (vrednostRobe <= 0) {
						System.out.println("Morate uneti pozitivnu vrednost");

					} else {
						iznosZaPlacanje = vrednostRobe;
						System.out.println("Iznos koji treba da platite je: " + iznosZaPlacanje + " dinara");
					}
				}
				
				break;

			case 0:
				System.out.println("Izlaz iz programa");
				break;
			default:
				System.out.println("Morate uneti 1 ili 0");
				break;

			}
		} while (izbor != 0);

	}
}
