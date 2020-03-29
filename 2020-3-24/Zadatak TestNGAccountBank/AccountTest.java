package bankaTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bankaKod.Account;

public class AccountTest {
	/*
	 * Potrebno je napraviti test za ispravnost klase Account. Ako se na osnovu
	 * testova prona�e neka gre�ka u kodu potrebno je da se popravi originalnin
	 * kod.
	 * a)Proveriti da li konstruktor public Account(String name, String number)
	 * dobro postavlja argumente, kao i da li get metode vra�aju odgovaraju�e
	 * vrednosti. Kada se napravi ra�un, stanje treba da bude jednako 0.
	 * b)Proveriti
	 * da li set metode dobro postavljaju odgovaraju�e vrednosti, kao i da li get
	 * metode vra�aju odgovaraju�e vrednosti. Ve�ba kod kuce. 
	 * c)Proveriti da li je
	 * ispravan format ispisa jednog Account-a. O�ekivani format ispisa:
	 * broj<tab>ime<tab>stanje. Stanje treba da bude zaokru�eno na dve
	 * decimale.
	 * d)Napraviti 100 000 naloga pomo�u konstruktora public Account(String
	 * name) i proveriti dali se svi brojevi razlikuju.
	 */

	@Test
	public void testKonstruktora() {
		String ime = "Jovana";
		String broj = "145766";
		Account racun = new Account(ime, broj);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getName(), ime);
		sa.assertEquals(racun.getNumber(), broj);
		sa.assertEquals(racun.getAmount(), 0d);
		sa.assertAll();
	}
	
	@Test
	public void testSetMetode() {

		Account racun = new Account("Jovana", "145766");
		racun.setAmount(1000.00);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getAmount(), 1000d);;
		sa.assertAll();
	}
	
	@Test
	public void testNumber() {
		
		Account[] racuni = new Account[100];
		
		for (int i = 0; i<racuni.length;i++) {
			racuni[i]= new Account("Jovana");
		}

		SoftAssert sa = new SoftAssert();
		for (int i = 0; i<racuni.length;i++) {
			String broj = racuni[i].getNumber();
			for (int j = i+1; j<racuni.length;j++) {
				sa.assertNotEquals(broj, racuni[j].getNumber());
				
			}
		}
		sa.assertAll();
	}
	
	@Test
	public void testStringMetode() {

		Account racun = new Account("Jovana", "145766");
		racun.setAmount(1000.0000);
		racun.toString();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.toString(), String.format("%s %s %.2f", "145766", "Jovana", 1000.00));
		System.out.println(racun.toString());
		sa.assertAll();
	}
}
