package itbootcamp.vezbe;

import java.util.Scanner;

public class Switch_Primer1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Upisi vrednost");

		int x = sc.nextInt();

		switch (x) {
		case 2:
			System.out.println("D");
			break;
		case 3:
			System.out.println("A");
			break;
		case 5:
			System.out.println("B");
			break;
		default:
			System.out.println("suprotno od zadatog");
			break;
		case 0:
			System.out.println("C");
			break;
		}
		
//		ako hocemo isti rezultat za vise case (ovde primer 2,3,5)
		switch (x) {
		case 2:
		case 3:
		case 5:
			System.out.println("B");
			break;
		default:
			System.out.println("suprotno od zadatog");
			break;
		case 0:
			System.out.println("C");
			break;
		}
	}

}
