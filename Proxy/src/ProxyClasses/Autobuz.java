package ProxyClasses;

public class Autobuz implements MijlocTransport{
    private int nrCalatori;
    private String model;

    public Autobuz(int nrCalatori, String model) {
        this.nrCalatori = nrCalatori;
        this.model = model;
    }

    @Override
    public void opresteStatie() {
        System.out.println("autobuzul a oprit in statie cu "+nrCalatori+" calatori");
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

}
