package mementoClasses;

public class Autobuz {
    private String numeSofer;
    private int consum;
    private String model;
    private int nrLocuri;

    public Autobuz(String numeSofer, int consum, String model, int nrLocuri) {
        this.numeSofer = numeSofer;
        this.consum = consum;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    public void setNumeSofer(String numeSofer) { //obligatoriu
        this.numeSofer = numeSofer;
    }

    public void setConsum(int consum) {
        this.consum = consum;
    }

    public AutobuzMemento SalvareMemento(){
        return new AutobuzMemento(numeSofer,consum);
    }

    public void revinoLaOStareAnterioara(AutobuzMemento autobuzMemento){
        this.numeSofer = autobuzMemento.getNumeSofer();
        this.consum = autobuzMemento.getConsum();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", consum=").append(consum);
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
