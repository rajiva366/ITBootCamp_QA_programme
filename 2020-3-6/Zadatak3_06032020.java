package ivanaRajcic.domaci;

import java.util.Scanner;

public class Zadatak3_06032020 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci.Primer1 niza: 3 54 123 18Ispis: Niz nije rastuci.Primer2 niza: 71 422
		 * 1001 5054Ispis: Niz je rastuci.
		 */
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Unesite broj elemenata niza:");
		n = sc.nextInt();
		System.out.println();
		int niz[] = new int[n];

		int broj;
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj niza: ");
			broj = sc.nextInt();
			niz[i] = broj;

		}

		System.out.println("Elementi niza su: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		boolean signal = true;
		int brojPoredjenja = n-1;
		for (int i = 0; i < brojPoredjenja; i++) {
			if (niz[i] > niz[i + 1]) {
				signal = false;
				break;
			}
		}
		if (signal==true) {
			System.out.println("Niz je rastuci.");
		}else {
			System.out.println("Niz nije rastuci.");
		}
	}

}
