import java.io.ObjectInputStream.GetField;

public class GlavniProgramPredstava {

	public static void main(String[] args) {
		/*
		 * 2. Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i
		 * naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku
		 * naziv[id].
		 * 
		 * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i
		 * pozoristem u kojem je zaposlen. Svi podaci mogu da se dohvate. Moze da se
		 * sastavi tekstualni opis u obliku ime[naziv_pozorista].
		 * 
		 * Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je
		 * uloga_ime[naziv_pozorista].
		 * 
		 * Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik
		 * je nadimak_ime[naziv_pozorista].
		 * 
		 * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene
		 * koji ucestvuju u realizaciji predstave. Zaposleni za realizaciju predstave
		 * mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
		 * Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv
		 * pozorista u kojem se predstava odrzava razdvojene zarezom, a potom zaposlene
		 * koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
		 * 
		 */

		Pozoriste p1 = new Pozoriste("Pozoriste lutaka");
		System.out.println(Pozoriste.getIdPozoriste());
		Pozoriste p2 = new Pozoriste("Beogradsko dramsko pozoriste");
		System.out.println(Pozoriste.getIdPozoriste());

		Glumac g1luktka = new Glumac("Marko Markovic", p1, "Paja patak");
		Glumac g2lutka = new Glumac("Jelena Mirkovic", p1, "Mini");
		Glumac g3lutak = new Glumac("Ivan Ivanovic", p1, "Miki maus");
		Reditelj r1lutka = new Reditelj("Boris Bizetic", p1, "Bizi");

		Predstava dizni = new Predstava("Dizni", p1);
		dizni.dodajZaposlenog(r1lutka);
		dizni.dodajZaposlenog(g1luktka);
		dizni.dodajZaposlenog(g2lutka);
		dizni.opisPredstave();
		System.out.println(dizni.getBrZaposlenihNaPredstavi());
		System.out.println(" ");
		dizni.dodajZaposlenog(g3lutak);
		dizni.opisPredstave();
		System.out.println(dizni.getBrZaposlenihNaPredstavi());
		System.out.println(" ");
		dizni.izbaciZaposlenogSaPredstave(g2lutka);
		dizni.opisPredstave();
		System.out.println(dizni.getBrZaposlenihNaPredstavi());
		System.out.println(" ");
		Predstava ozbiljnijeOddiznija = new Predstava("Ozbiljnije od diznija", p2);
		ozbiljnijeOddiznija.dodajZaposlenog(g3lutak);
		ozbiljnijeOddiznija.dodajZaposlenog(r1lutka);
		ozbiljnijeOddiznija.opisPredstave();
	}

}
