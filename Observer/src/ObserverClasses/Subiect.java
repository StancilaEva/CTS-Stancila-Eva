package ObserverClasses;

public interface Subiect {
    public void aboneaza(Observer observer);
    public void dezaboneaza(Observer observer);
    public void notifyCalatori(String mesaj);
}
