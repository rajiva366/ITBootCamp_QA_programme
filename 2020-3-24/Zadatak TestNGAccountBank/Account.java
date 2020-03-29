package bankaKod;

import java.util.UUID;

public class Account {

	private String number;
	private String name;
	private Double amount;

	public Account(String name, String number) {
		this.number = number;
		this.name = name;
		this.amount = 0d;
	}
//UUID generise nasumican int broj i prebacuje vrednost u string, i postavlja ga za vrednost broja racuna 
	public Account(String name) {
		this(name, UUID.randomUUID().toString());
		//ovo this poziva drugi konstruktor iz pve klase
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return String.format("%s %s %.2f", number, name, amount);
	}
}
