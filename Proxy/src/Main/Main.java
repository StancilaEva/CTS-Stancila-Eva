package Main;

import ProxyClasses.Autobuz;
import ProxyClasses.AutobuzDeNoapte;
import ProxyClasses.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz2 = new Autobuz(0,"ceva");
        autobuz2.opresteStatie();
        MijlocTransport autobuzDeNoapte2 = new AutobuzDeNoapte(autobuz2);
        autobuzDeNoapte2.opresteStatie();
        ((Autobuz)autobuz2).setNrCalatori(7);
        autobuz2.opresteStatie();
    }
}
