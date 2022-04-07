package CompositeClasses;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Grup implements NodAbastract{
    List<NodAbastract> lista ;
    private String denumire;

    public Grup(String denumire) {
        this.denumire = denumire;
        lista = new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(denumire);
        for (NodAbastract nodAbastract:lista) {
           nodAbastract.afiseazaDescriere();
        }
    }

    @Override
    public void add(NodAbastract nodAbastract) {
        lista.add(nodAbastract);
    }

    @Override
    public NodAbastract get(int index) {
        return lista.get(index);

    }

    @Override
    public void remove(NodAbastract nodAbastract) {
        lista.remove(nodAbastract);
    }
}
