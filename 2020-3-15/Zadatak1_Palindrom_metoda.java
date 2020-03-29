package itbootcamp.zadaci2020_03_15;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1_Palindrom_metoda {

	// Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
	// palindrom”
	// ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije palindrom).
	// Korisnik unosi int [ ]
	// uradi koristeci metode

	public static int odrediVelicinuNiza() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti duzinu niza: ");
		int velicinaNiza = sc.nextInt();

		return velicinaNiza;
	}

	public static int[] punjenjeNiza() {
		int[] niz = new int[odrediVelicinuNiza()];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi vrednost " + (i + 1) + ". elementa niza:");
			Scanner sc = new Scanner(System.in);
			niz[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(niz));
		return niz;
	}

	public static void daLiJeNizPalindrom() {
		boolean signal = true;
		int[] niz = punjenjeNiza();
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

	public static void main(String[] args) {
		
		daLiJeNizPalindrom();
		

	}

}
