package mementoClasses;

public class AutobuzMemento {
    private String numeSofer;
    private int consum;

    public AutobuzMemento(String numeSofer, int consum) {
        this.numeSofer = numeSofer;
        this.consum = consum;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public int getConsum() {
        return consum;
    }
}
