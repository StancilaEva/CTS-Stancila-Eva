package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AngajatReader reader = new AngajatReader(new File("angajati.txt"));
		try {
			listaAngajati = reader.readAplicanti();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
