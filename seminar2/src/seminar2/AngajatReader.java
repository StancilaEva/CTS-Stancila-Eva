package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AngajatReader extends AplicantReader{


    AngajatReader(File numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {

        List<Aplicant> angajati = new ArrayList<Aplicant>();
         scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            Angajat a = new Angajat();
            citesteAplicant(a);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            a.setSalariu(salariu);
            a.setOcupatie(ocupatie);
            angajati.add(a);
        }
        scanner.close();
        return angajati;
    }
}
