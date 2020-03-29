package itbootcamp.zadaci2020_03_15;

import java.util.Scanner;

public class SahPionNapadaSkakaca {

	/*
	 * Na sahovskoj tabli je red obelezen brojevima 1 2 3 4 5 6 7 8 i kolona takodje
	 * brojevima 12 3 4 5 6 7 8. Na tabli stoje beli pion i crni skakac. Beli pion
	 * pocinje sa dna table a crni skakac sa vrha.Korisnik prvo unosi poziciju piona
	 * kao dva cela broja, a zatim poziciju skakaca, gde prvi broj predstavlja red,
	 * a drugi kolonu. Program treba da ispise da li se figure nalaze u poziciji da
	 * je skakac napadnut. Primeri: 6 4 7 4 ---> skakac nije napadnut 6 4 5 5 --->
	 * skakac jeste napadnut 2 2 1 1 ---> skakac jeste napadnut 9 1 6 8 ---> greska
	 * u unosu
	 */

	public static void main(String[] args) {
		int redPiona;
		int kolonaPiona;
		int redSkakaca;
		int kolonaSkakaca;

		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti 1. broj: ");
		redPiona = sc.nextInt();
		System.out.println("Uneti 2. broj: ");
		kolonaPiona = sc.nextInt();
		System.out.println("Uneti 3. broj: ");
		redSkakaca = sc.nextInt();
		System.out.println("Uneti 4. broj: ");
		kolonaSkakaca = sc.nextInt();
		System.out.println("Pozicije vasih figura - red i kolona piona i red i kolona skakaca respektivno su: "
				+ redPiona + " " + kolonaPiona + " " + redSkakaca + " " + kolonaSkakaca);
		if (redPiona < 1 || redPiona > 8 || kolonaPiona < 1 || kolonaPiona > 8 || redSkakaca < 1 || redSkakaca > 8
				|| kolonaSkakaca < 1 || kolonaSkakaca > 8) {
			System.out.println("Brojevi moraju biti od 1 do 8");
		} else {
			if (redPiona <= redSkakaca) {
				System.out.println("Skakac nije napadnut");
			} else {
				if (redPiona > redSkakaca + 1 || kolonaSkakaca > kolonaPiona + 1 || kolonaPiona > kolonaSkakaca + 1) {
					System.out.println("Skakac nije napadnut");
				} else {
					System.out.println("Skakac je napadnut");
				}
			}
		}
	}

}
