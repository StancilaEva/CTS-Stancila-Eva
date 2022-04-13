package main;

import FlyweightClasses.Autobuz;
import FlyweightClasses.Linie;
import FlyweightClasses.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("autobuz 1",1999,25);
        Autobuz autobuz2 = new Autobuz("autobuz 2",1995,20);
        Autobuz autobuz3 = new Autobuz("autobuz 3",1993,30);
        Autobuz autobuz4 = new Autobuz("autobuz 4",1990,25);
        LinieFactory linieFactory = new LinieFactory();
        Linie linie1 = linieFactory.getLinie(168);
        Linie linie2 = linieFactory.getLinie(170);
        Linie linie3 = linieFactory.getLinie(190);
        Linie linie4 = linieFactory.getLinie(120);
        linie1.afiseazaDescriere(autobuz1);
        linie2.afiseazaDescriere(autobuz2);
        linie3.afiseazaDescriere(autobuz3);
        linie4.afiseazaDescriere(autobuz4);
        linieFactory.getLinie(168).afiseazaDescriere(autobuz1);
        linieFactory.getLinie(170).afiseazaDescriere(autobuz2);
    }
}
