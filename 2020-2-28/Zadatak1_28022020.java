package ivanaRajcic.domaci;

import java.util.Scanner;

public class Zadatak1_28022020 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();
		int suma = 0;
		while (broj > 0) {
			suma = suma + broj;
			System.out.println("Unesite broj: ");
			broj = sc.nextInt();
		}
		
		System.out.println("Suma unetih pozitivnih brojeva je " + suma);
	}

}
