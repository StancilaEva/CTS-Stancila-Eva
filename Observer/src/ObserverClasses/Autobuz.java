package ObserverClasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Autobuz implements Subiect{
    private Set<Observer> abonati;
    private int numarAutobuz;

    public Autobuz(int numarAutobuz) {
        abonati = new HashSet<>();
        this.numarAutobuz = numarAutobuz;
    }

    @Override
    public void aboneaza(Observer observer) {
        abonati.add(observer);
    }

    @Override
    public void dezaboneaza(Observer observer) {
        abonati.remove(observer);
    }

    @Override
    public void notifyCalatori(String mesaj) {
        for (Observer obs:abonati) {
            obs.primesteMesaj(mesaj);
        }
    }

    public void pleacaDeLaCapat(){
        String mesaj = "autobuzul cu numarul "+numarAutobuz+" pleaca de la capat";
        notifyCalatori(mesaj);
    }
}
