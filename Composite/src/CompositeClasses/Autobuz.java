package CompositeClasses;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements NodAbastract{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this);
    }

    @Override
    public void add(NodAbastract nodAbastract) {
        try {
            throw new Exception();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public NodAbastract get(int index) {
        try {
            throw new Exception();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void remove(NodAbastract nodAbastract) {
        try {
            throw new Exception();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
