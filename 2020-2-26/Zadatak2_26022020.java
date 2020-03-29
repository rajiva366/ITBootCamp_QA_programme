package ivanaRajcic.domaci;

import java.util.Scanner;

public class Zadatak2_26022020 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima
		 * meseci u godini koji pocinju na to slovo(na taj glas) - za resavanje ovog
		 * zadatka koristiti switch
		 */
		int brojMeseciIstoPocetnoSlovo = 0;
		Scanner sc = new Scanner(System.in);

		while (brojMeseciIstoPocetnoSlovo == 0) { // jer ce nula biti samo kad unese String koji se ne poklapa sa
													// nazivom meseca iz bilo kog definisanog case u okviru switch
			System.out.println("Unesite naziv meseca:");
			String mesec = sc.next();
			String mesecBezobziraNaSlova = mesec.toLowerCase();

			switch (mesecBezobziraNaSlova) {
			case "januar":
				if (mesecBezobziraNaSlova.startsWith("j")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "februar":
				if (mesecBezobziraNaSlova.startsWith("f")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "mart":
				if (mesecBezobziraNaSlova.startsWith("m")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "april":
				if (mesecBezobziraNaSlova.startsWith("a")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "maj":
				if (mesecBezobziraNaSlova.startsWith("m")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "jun":
				if (mesecBezobziraNaSlova.startsWith("j")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "jul":
				if (mesecBezobziraNaSlova.startsWith("j")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "avgust":
				if (mesecBezobziraNaSlova.startsWith("a")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "septembar":
				if (mesecBezobziraNaSlova.startsWith("s")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "oktobar":
				if (mesecBezobziraNaSlova.startsWith("o")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "novembar":
				if (mesecBezobziraNaSlova.startsWith("n")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
			case "decembar":
				if (mesecBezobziraNaSlova.startsWith("d")) {
					brojMeseciIstoPocetnoSlovo = brojMeseciIstoPocetnoSlovo + 1;
				}
				break;
			default:
				System.out.println("Morate uneti validan naziv meseca.");

			}

			if (brojMeseciIstoPocetnoSlovo == 1) {
				System.out.println("U godini samo " + mesecBezobziraNaSlova + " pocinje slovom "
						+ mesecBezobziraNaSlova.charAt(0));
				System.out.println("");
			} else {
				if (brojMeseciIstoPocetnoSlovo <= 4) {
					System.out.println("U godini ima " + brojMeseciIstoPocetnoSlovo
							+ " meseca koja pocinju istim slovom kao mesec " + mesecBezobziraNaSlova);
					System.out.println("");
				} else {
					System.out.println("U godini ima " + brojMeseciIstoPocetnoSlovo
							+ " meseci koji pocinju istim slovom kao mesec " + mesecBezobziraNaSlova);
					System.out.println("");
				}
			}
		}
	}
}
