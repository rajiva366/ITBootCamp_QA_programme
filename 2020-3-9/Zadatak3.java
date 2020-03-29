package itbootcamp.zadaci2020_03_09;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// Korisnik unosi recenicu po izboru. Prebrojati koliko ima reci koje pocinju
		// slovom d.

		String recenica;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		recenica = sc.nextLine();

		String nizReci[] = recenica.split(" ");
		System.out.println(Arrays.toString(nizReci));

		int brojReciD = 0;
		for (int i = 0; i < nizReci.length; i++) {
			if (nizReci[i].startsWith("d") || nizReci[i].startsWith("D")) {
				brojReciD += 1;
			}
		}

		System.out.println("Broj reci koje pocinju slovom D/d je: " + brojReciD);

	}

}
