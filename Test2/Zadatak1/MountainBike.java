
public class MountainBike extends Bicikli{
	
	private int visinaSedista;

	public MountainBike(int menjac, int brzina, int visinaSedista) {
		super(menjac, brzina);
		this.visinaSedista = visinaSedista;
	}

	public int getVisinaSedista() {
		return visinaSedista;
	}

	public void setVisinaSedista(int visinaSedista) {
		this.visinaSedista = visinaSedista;
	}
	
	
	public void ispisiMouninBike() {
		ispisiBicikli();
		System.out.println("visina sedista je "+getVisinaSedista()+"cm");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+"visina sedista je "+getVisinaSedista()+"cm";
	}

}
