package ivanaRajcic.domaci;

import java.util.Scanner;

public class Zadatak3_26022020 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju)
		 * podrazumeva se da se n ucitava preko standardnog ulaza
		 */
		int sumaParnih=0;
		int proizvodNeparnih=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite jedan broj:");
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			if ((i+1)%2==0) {
				sumaParnih=sumaParnih+(i+1);
			} else {
				proizvodNeparnih=proizvodNeparnih*(i+1);
			}
		}
		System.out.println("Za broj "+n+" suma parnih brojeva je "+sumaParnih+", a proizvod neparnih je "+proizvodNeparnih);
	}

}
