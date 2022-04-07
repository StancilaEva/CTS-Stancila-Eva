package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ElevReader extends AplicantReader{

    ElevReader(File numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {

        scanner.useDelimiter(",");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Elev elev = new Elev();
            citesteAplicant(elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        scanner.close();
        return elevi;
    }
}
