package itbootcamp.zadaci2020_03_09;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		// niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti duzinu niza: ");
		int velicinaNiza = sc.nextInt();
		int[] niz = new int[velicinaNiza];

		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi vrednost " + (i + 1) + ". elementa niza:");
			niz[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(niz));
		
		int proizvod=1;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i]>i) {
				proizvod= proizvod*niz[i];
			}
		}
		
		System.out.println("Proizvod elemenata niza koji su veci od svog indeksa je: "+proizvod);
	}

}
