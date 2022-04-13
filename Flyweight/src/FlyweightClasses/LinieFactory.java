package FlyweightClasses;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    private Map<Integer,Linie> linii;

    public LinieFactory() {
        linii = new HashMap<>();
    }

    public Linie getLinie(int nrLinie){
        if(linii.containsKey(nrLinie)) {
            return linii.get(nrLinie);
        }
        else {
            Linie linie = new Linie(nrLinie,"Victoriei","Unirii");
            linii.put(nrLinie,linie);
            return linie;
        }
    }
}
