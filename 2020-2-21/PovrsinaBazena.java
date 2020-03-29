package ivanaRajcic.domaci;

import java.util.Scanner;

public class PovrsinaBazena {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Izracunavanje povrsine i obima bazena");
		System.out.println("Unesi dužinu stranice a: ");
		int a= sc.nextInt();
		
		System.out.println("Unesi dužinu stranice b: ");
		int b= sc.nextInt();
		
		System.out.println("Unesi dužinu stranice c: ");
		int c= sc.nextInt();
		
		int povrsina = 2*(a+b+a+c+b+c);
		int obim = a*b*c;
		System.out.println("Povrsina bazena za unete stranice je: "+povrsina+"metara kvadratnih");
		System.out.println("");
		System.out.println("Obim bazena za unete stranice je: "+obim+"metara kubnih");

	}

}
