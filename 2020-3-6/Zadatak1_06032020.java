package ivanaRajcic.domaci;

import java.util.Scanner;

public class Zadatak1_06032020 {

	public static void main(String[] args) {

		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 */

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Unesite broj elemenata niza:");
		n = sc.nextInt();
		System.out.println();
		int niz[] = new int[n];

		System.out.println("Unesite broj sa kojim zelite da delite brojeve niza:");
		int br = sc.nextInt();

		int broj;
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj niza: ");
			broj = sc.nextInt();
			niz[i] = broj;

		}

		System.out.println("Niz cine sledeci brojevi:");

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0)
				System.out.println((i + 1) + ". element niza je: " + niz[i]);
		}

	}

}
