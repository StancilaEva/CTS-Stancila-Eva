package ObserverClasses;

public class Calator implements Observer{
    String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume+" am fost notificat: "+mesaj);
    }
}
