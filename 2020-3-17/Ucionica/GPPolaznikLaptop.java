package itbootcamp.ucionicaDomaci17032020;

public class GPPolaznikLaptop {

	public static void main(String[] args) {

		Polaznik p1 = new Polaznik("Mili", "Rankovic");
		Polaznik p2 = new Polaznik("Marko", "Markovic");
		Polaznik p3 = new Polaznik("Sandra", "Jovanovic");
		
		System.out.println(p1.toString());
		
		Laptop l1= new Laptop("Lenovo");
		l1.prosiritiListu(p1);
		l1.prosiritiListu(p2);
		l1.prosiritiListu(p3);
		l1.ispisiLaptop();
		l1.smanjitiListu(p2);
		l1.ispisiLaptop();
	}

}
