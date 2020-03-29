package ivanaRajcic.domaci;

import java.util.Scanner;

public class Zadatak5_28022020 {

	public static void main(String[] args) {
//		Napisati program koji ce ispisati n brojeva Fibonacijevog niza
//		Predstavlja niz brojeva u kome zbir prethodna dva broja u nizu daju vrednost narednog �lana niza. 
//		Indeksiranje �lanova ovog niza po�inje od nule a prva dva �lana su mu 0 i 1.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj za koji je potrebno prikazati Fibonacijev niz:");
		int n = sc.nextInt();

		
		int prviBroj = 0;
		int drugiBroj = 1;
		
		
		for (int i = 1; i <= n; i++) {
			System.out.print(prviBroj + " ");
			int sledeciBroj=prviBroj+drugiBroj;
			prviBroj=drugiBroj;
			drugiBroj=sledeciBroj;

		}

	}
}
