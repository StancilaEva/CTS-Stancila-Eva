public class Tramvai extends MijlocTransport{
    private String vatman;

    public Tramvai(String nrInmatriculare,String vatman) {
        super(nrInmatriculare);
        this.vatman = vatman;
    }

    public String getVatman() {
        return vatman;
    }

    public void setVatman(String vatman) {
        this.vatman = vatman;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append(super.toString());
        sb.append("vatman='").append(vatman).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }
}
