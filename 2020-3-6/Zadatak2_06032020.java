package ivanaRajcic.domaci;

import java.util.Scanner;

public class Zadatak2_06032020 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom.Primer niza: 32 54 123 18 Ispis: 18 123 54 32
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


		System.out.println("Elementi niza ispisani inverznim redosledom su: ");
		for (int i = niz.length-1; i >=0; i--) {
				System.out.println(niz[i]);
		}

	}

}
