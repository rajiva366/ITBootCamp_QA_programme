package itbootcamp.zadaci2020_03_09;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
// Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je palindrom” 
//ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije palindrom). 
//Korisnik unosi int [ ]

		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti duzinu niza: ");
		int velicinaNiza = sc.nextInt();
		int[] niz = new int[velicinaNiza];

		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi vrednost " + (i + 1) + ". elementa niza:");
			niz[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(niz));
		boolean signal = true;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != niz[niz.length - 1 - i]) {
				signal = false;
				break;

			}
		}
		if (signal == true) {
			System.out.println("Niz je palindrom.");
		} else {
			System.out.println("Niz nije palindrom.");
		}
	}
}
