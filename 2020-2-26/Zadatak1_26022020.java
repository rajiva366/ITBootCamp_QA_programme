package ivanaRajcic.domaci;

import java.util.Scanner;

public class Zadatak1_26022020 {
	public static void main(String[] args) {
		/*
		 * U zgradi se nalazi lift nosivosti 680kg Napisati program koji proverava da li
		 * ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese.
		 * Podrazumevane 3 opcije Lift je preopterecen; Na granici je; Lift je pokrenut
		 * (zahtevi zadatka namerno nisu dalje razradjivani jer 1) ostavljam vasoj masti
		 * na volju 2) zelim da budem upucena u vas tok razmisljanja)
		 */

		double nosivost = 680;
		double tezinaTereta;

		Scanner sc = new Scanner(System.in);

		int opcija = 0;

		while (opcija != 2) {
			System.out.println("Izabrati jednu od opcija (uneti broj opcije):");
			System.out.println(
					"1. Proveriti da li ce lift bezbedno krenuti u zavisnosti od tezine koju treba da ponese.");
			System.out.println("2. Izaci iz programa.");
			opcija = sc.nextInt();

			switch (opcija) {
			case 1:
				System.out.println("Napisati tezinu koju lift treba da ponese u kg:");
				tezinaTereta = sc.nextDouble();
				
				if(tezinaTereta>nosivost) {
					System.out.println("Lift je preopterecen!");
					System.out.println(" ");
				}else {
					if (tezinaTereta==nosivost) {
						System.out.println("Na granici je");
						System.out.println(" ");
					} else {
						System.out.println("Lift je bezbedan za pokretanje");
						System.out.println(" ");
					}
				}
				break;
			case 2:
				System.out.println("Izasli ste iz programa");
				break;
			default:
				System.out.println("Morate uneti broj 1 ili 2");
				break;
			}

		}
	}

}
