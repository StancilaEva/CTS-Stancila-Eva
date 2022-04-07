package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class StudentReader extends AplicantReader{

    StudentReader(File numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        scanner.useDelimiter(",");
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student student = new Student();
            citesteAplicant(student);
            int anStudii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            student.setAnStudii(anStudii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }
}
