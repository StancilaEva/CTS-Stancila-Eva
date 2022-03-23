package seminar2;

import java.io.File;
import java.util.Scanner;

public abstract class AplicantReader extends Reader{


    AplicantReader(File numeFisier) {
        super(numeFisier);
    }


    public void citesteAplicant(Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setProiecte(vect,nr);
    }
}
