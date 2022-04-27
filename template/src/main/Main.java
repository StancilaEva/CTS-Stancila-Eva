package main;

import templateClasses.Tramvai;
import templateClasses.TramvaiAbstract;
import templateClasses.TramvaiProba;

public class Main {
    public static void main(String[] args) {
        TramvaiAbstract tramvai = new Tramvai();
        TramvaiAbstract tramvaiProba = new TramvaiProba();
        tramvai.parcurgeTraseu();
        System.out.println("\n");
        tramvai.parcurgeTraseuInvers();
        System.out.println("\n");
        tramvaiProba.parcurgeTraseu();
        System.out.println("\n");
        tramvaiProba.parcurgeTraseuInvers();
        System.out.println("\n");
    }
}
