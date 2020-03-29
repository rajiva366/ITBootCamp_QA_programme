import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Tražiti od korisnika da unese pozitivan broj N. Zatim učitavati N brojeva sa
		 * standardnog ulaza i ispisati vrednost najmanjeg unetog broja.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da unesete:");
		int brojUnosa = sc.nextInt();
		if (brojUnosa <= 0) {
			System.out.println("Morate uneti pozitivan broj. Ponovite unos:");
			brojUnosa = sc.nextInt();
		}
		double broj1;
		double broj;
		double min;
		int i;

		System.out.println("Unesite broj:");
		broj1 = sc.nextDouble();
		min = broj1;

		for (i = 1; i < brojUnosa; i++) {
			System.out.println("Unesite broj:");
			broj = sc.nextDouble();

			if (broj < min) {
				min = broj;
			}
		}

		System.out.println("Minimalni broj je " + min);

	}

}
