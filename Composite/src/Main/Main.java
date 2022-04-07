package Main;

import CompositeClasses.Autobuz;
import CompositeClasses.Grup;
import CompositeClasses.NodAbastract;

public class Main {
    public static void main(String[] args) {
        NodAbastract nodAbastract = new Grup("flota");
        NodAbastract nodAbstractMici = new Grup("mici");
        NodAbastract nodAbstractMedii = new Grup("medii");
        NodAbastract autobuz1 = new Autobuz("Dacia","aaa",4);
        NodAbastract autobuz2 = new Autobuz("Dacia","bbb",5);
        NodAbastract autobuz3 = new Autobuz("Dacia","ccc",53);
        nodAbstractMici.add(autobuz1);
        nodAbstractMici.add(autobuz2);
        nodAbstractMedii.add(autobuz3);
        nodAbastract.add(nodAbstractMedii);
        nodAbastract.add(nodAbstractMici);
        nodAbastract.afiseazaDescriere();
    }
}
