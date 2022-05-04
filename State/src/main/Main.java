package main;

import stateClasses.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(12);
        autobuz.pleacaInCursa();
        autobuz.trimiteInService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.trimiteInService();
        autobuz.pleacaInCursa();
        autobuz.scoateDinService();

    }
}
