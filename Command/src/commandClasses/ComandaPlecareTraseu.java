package commandClasses;

public class ComandaPlecareTraseu implements Comanda{
    private int numarLinie;
    private Autobuz autobuz;

    public ComandaPlecareTraseu(int numarLinie, Autobuz autobuz) {
        this.numarLinie = numarLinie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.plecarePeTraseu(numarLinie);
    }
}
