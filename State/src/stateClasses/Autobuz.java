package stateClasses;

public class Autobuz {
    private StareAutobuz stare;
    private Integer nrAutobuz;

    public Autobuz(Integer nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare = new LaCapatDeLinie();

    }

    public Integer getNrAutobuz() {
        return nrAutobuz;
    }

     void setNrAutobuz(Integer nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public StareAutobuz getStare() {
        return stare;
    }

     void setStare(StareAutobuz stare) {
        this.stare = stare;
    }

    public void pleacaInCursa(){
        StareAutobuz inCursa = new InCursa();
        inCursa.modificaStare(this);
    }
    public void ajungeLaCapatDeLinie(){
        StareAutobuz capat = new LaCapatDeLinie();
        capat.modificaStare(this);
    }
    public void trimiteInService(){
        StareAutobuz service = new LaReparat();
        service.modificaStare(this);
    }
    public void scoateDinService(){
        StareAutobuz scoate = new LaCapatDeLinie();
        scoate.modificaStare(this);
    }
}
