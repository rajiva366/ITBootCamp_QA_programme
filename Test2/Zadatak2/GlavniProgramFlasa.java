import java.util.ArrayList;

public class GlavniProgramFlasa {

	public static void main(String[] args) {
		
		StaklenaFlasa s1 = new StaklenaFlasa("Baylis", 1650.00, 0.75);
		s1.ispisiStaklenu();
		StaklenaFlasa s2= new StaklenaFlasa("Pivo", 64.00, 0.33);
		s2.ispisiStaklenu();
		StaklenaFlasa s3= new StaklenaFlasa("Rakija medovaca", 2750.00, 0.75);
		s3.ispisiStaklenu();
		PlasticnaFlasa p1 = new PlasticnaFlasa("CocaCola", 99.99, 1.5);
		p1.ispisiPlasticnu();
		PlasticnaFlasa p2 = new PlasticnaFlasa("Voda Rosa", 43.99, 1.0);
		p2.ispisiPlasticnu();
		
		ArrayList<StaklenaFlasa> listaStaklo= new ArrayList<StaklenaFlasa>();
		ArrayList<PlasticnaFlasa> listaPlastika = new ArrayList<PlasticnaFlasa>();
		
		listaStaklo.add(s1);
		listaStaklo.add(s2);
		listaStaklo.add(s3);
		
		listaPlastika.add(p1);
		listaPlastika.add(p2);
		
		double racun = 0;
		double racunStaklo=0;
		double racunPlastika=0;
		// vise bodova nosi ako je napisano kao metoda i pozvano u main. 
		for (int i=0;i<listaStaklo.size();i++) {
			racunStaklo = racunStaklo+listaStaklo.get(i).getCenaSaKaucijom();
		}
		
		for (int i=0; i<listaPlastika.size();i++) {
			racunPlastika=racunPlastika+listaPlastika.get(i).getCenaBezKaucije();
		}
		racun=racunStaklo+racunPlastika;
		System.out.println("Racun za svo kupljeno pice iznosi "+racun+" dinara.");

	}

}
