package ivanaRajcic.domaci;

public class Zadatak3_28022020 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		 * (ukljucujuci i njih) deljivih brojem 3.
		 */
		
		int brojBrojevaDeljivihSaTri=0;
		for (int i=9;i<=250;i++) {
			if(i%3==0) {
				brojBrojevaDeljivihSaTri=brojBrojevaDeljivihSaTri+1;
			}
		}
		System.out.println(brojBrojevaDeljivihSaTri+" broj od 9 do 250 je deljiv sa 3");
	}

}
