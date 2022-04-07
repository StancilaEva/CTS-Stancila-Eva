package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class Reader {
    protected Scanner scanner;
    Reader(File numeFisier){
        try {
            scanner = new Scanner(numeFisier);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
}
