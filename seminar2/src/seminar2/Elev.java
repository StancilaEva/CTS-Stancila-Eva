package seminar2;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	

	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		return "Elev " + super.toString() + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {

		super();

	}
	

	

}
