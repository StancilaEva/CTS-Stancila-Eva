package main;

import chainClasses.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransportHandler autobuz = new Autobuz(5);
        MijlocTransportHandler tramvai = new Tramvai(10);
        MijlocTransportHandler troleibuz = new Troleibuz(3);
        MijlocTransportHandler metrou = new Metrou();
        tramvai.setHandler(metrou);
        autobuz.setHandler(tramvai);
        troleibuz.setHandler(autobuz);
        int dist = 20;
        troleibuz.deplaseazaRequest(dist);

        MijlocTransportHandler autobuzArad = new Autobuz(10000);
        MijlocTransportHandler tramvaiArad = new Tramvai(2);
        tramvaiArad.setHandler(autobuzArad);
        tramvaiArad.deplaseazaRequest(4);

    }
}
