package bankaTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bankaKod.Account;
import bankaKod.Bank;

public class BankTest {
	Bank mobi;
	
	@BeforeClass
	public void konstruktorBanka() {
		 mobi = new Bank();
	}
	
	
  @Test(priority = 3)
  public void testOpen() {
	 mobi.reset();
	  int max = 5;
	  Account racuni[]= new Account[max];
	  for (int i =0; i<max;i++) {
		  racuni[i] = mobi.openAccount("Jovana"+i);
		  Assert.assertEquals(mobi.getAccount(racuni[i].getNumber()), racuni[i]);
	  }
  }
  
  @Test(priority = 2) 
  public void testUplata() {
	  mobi.reset();
	  Double uplata = 1500d;
	  Account a1=mobi.openAccount("Jovana");
	  Double stanjeNakonUplate = a1.getAmount()+uplata;
//	  System.out.println(stanjeNakonUplate);
	  mobi.payInMoney(a1.getNumber(), uplata);
//	  System.out.println(a1.getAmount());
	  Assert.assertEquals(a1.getAmount(), stanjeNakonUplate);	  
  }
  
  @Test(priority = 1)
  public void testTransfer() {
	  	mobi.reset();
		Double prenos = 1000d;
		Account a1 = mobi.openAccount("Dragoljub");
		Account a2 = mobi.openAccount("Djordje");
		a2.setAmount(5000d);
		mobi.transferMoney(a2.getNumber(), a1.getNumber(), prenos);
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(a1.getAmount(), 1000d);
		sf.assertEquals(a2.getAmount(), 4000d);
		sf.assertAll();
	}
  
  @Test(priority = 4)
  public void testWholeSumInBank() {
	 mobi.reset();
	  int max = 5;
	  Account racuni[]= new Account[max];
	  for (int i =0; i<max;i++) {
		  racuni[i] = mobi.openAccount("Jovana"+i);
	  }
	  
	  racuni[1].setAmount(1000d);
	  racuni[2].setAmount(2000d);
	  racuni[3].setAmount(5000d);
	  double rezultat;
	 rezultat = mobi.getSumMoney();
	 
	 Assert.assertEquals(rezultat, 8000d);
  }
}
