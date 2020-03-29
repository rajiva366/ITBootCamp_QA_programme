package ivanaRajcic.domaci;

public class Zadatak1_02032020 {

	public static void main(String[] args) {
		/*
		 * Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		 * dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati
		 * kako koji primer funkcionise. Napisati po 2 primera o svakom, koristeci
		 * promenljive a, b, c koje su i deklarisane i definisane (kao sto smo na tabli
		 * vezbali na casu
		 */

		
//		++a; // isto kao da smo napisali a=a+1	
		int a = 20;
		int b = 45;
		int c=++a + ++b; // 20+1 + 45+1 =67
		
		System.out.println(a); //povecan za 1 na 21
		System.out.println(b); // povenacn za 1 na 46
		System.out.println(c); // 67
		System.out.println("");
		
		a=++c + ++b; //67+1 + 46+1=115
		System.out.println(a); //115
		System.out.println(b); //47
		System.out.println(c); //68
		System.out.println("");

//		--b; // isto kao da smo napisali b=b-1
		
		b=--a + ++c; //115-1 + 68+1=183
		System.out.println(a); //114
		System.out.println(b); //183
		System.out.println(c); //69
		System.out.println("");
		
		c=--a + --b; //114-1 + 183-1=295
		System.out.println(a); //113
		System.out.println(b); //182
		System.out.println(c); //295
		System.out.println("");
		
//		a++ uzima prethodnu vrednost, ali pamti novu
		
		c=a++ + b++; //113+182=295
		System.out.println(a); //114
		System.out.println(b); //183
		System.out.println(c); //295
		System.out.println("");
		
		c=a++ + b++; //114+183=297
		System.out.println(a); //115
		System.out.println(b); //184
		System.out.println(c); //297
		System.out.println("");
		
//		a-- uzima prethodnu vrednost, ali pamti novu		
		
		c=a-- + b--; //115+184=299
		System.out.println(a); //114
		System.out.println(b); //183
		System.out.println(c); //299
		System.out.println("");
		
		c=a-- + b--; //114+183=297
		System.out.println(a); //113
		System.out.println(b); //182
		System.out.println(c); //297
		System.out.println("");
		
		

	}

}
