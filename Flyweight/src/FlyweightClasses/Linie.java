package FlyweightClasses;

public class Linie implements AutobuzLinie{//FlyWeight-ul
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public String getPrimaStatie() {
        return primaStatie;
    }

    public void setPrimaStatie(String primaStatie) {
        this.primaStatie = primaStatie;
    }

    public String getUltimaStatie() {
        return ultimaStatie;
    }

    public void setUltimaStatie(String ultimaStatie) {
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');

        return sb.toString();
    }

    @Override
    public void afiseazaDescriere(Autobuz autobuz) {
        System.out.println( this.toString()+

        autobuz.toString());
    }
}
