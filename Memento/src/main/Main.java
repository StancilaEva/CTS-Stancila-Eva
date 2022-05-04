package main;

import mementoClasses.Autobuz;
import mementoClasses.AutobuzMemento;
import mementoClasses.MementoManager;

public class Main {

    public static void main(String[] args) {
        MementoManager mementoManager = new MementoManager();
        Autobuz autobuz = new Autobuz("Ion",23,"nu stiu",12);
        AutobuzMemento autobuzMemento1 = autobuz.SalvareMemento();
        mementoManager.addMemento(autobuzMemento1);
        autobuz.setNumeSofer("Viorel");
        mementoManager.addMemento(autobuz.SalvareMemento());
        autobuz.setConsum(40);
        mementoManager.addMemento(autobuz.SalvareMemento());
        System.out.println(autobuz);
        autobuz.revinoLaOStareAnterioara(mementoManager.getMemento(0));
        System.out.println(autobuz);
    }
}
