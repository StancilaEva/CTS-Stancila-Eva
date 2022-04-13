package Main;

import ObserverClasses.Autobuz;
import ObserverClasses.Calator;
import ObserverClasses.Observer;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(123);
        Calator calator1 = new Calator("Ana");
        autobuz.aboneaza(calator1);
        Calator calator2 = new Calator("Mihai");
        autobuz.aboneaza(calator2);
        Calator calator3 = new Calator("Mihaela");
        autobuz.aboneaza(calator3);
        autobuz.pleacaDeLaCapat();
    }
}
