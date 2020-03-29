package itbootcamp.vezbe;

import java.util.Scanner;

public class Switch_Dani {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi broj: ");
		int dan = sc.nextInt();

		switch (dan) {
		case 1:
			System.out.println("ponedeljak");
			break;
		case 2:
			System.out.println("utorak");
			break;
		case 3:
			System.out.println("sreda");
			break;
		case 4:
			System.out.println("cetrvtak");
			break;
		case 5:
			System.out.println("petak");
			break;
		case 6:
			System.out.println("subota");
			break;
		case 7:
			System.out.println("nedelja");
			break;
		default:
			System.out.println("Morate uneti broj od 1 do 7");
			break;

		}
	}

}
