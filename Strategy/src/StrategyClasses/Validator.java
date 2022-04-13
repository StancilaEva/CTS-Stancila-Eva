package StrategyClasses;

public class Validator {
    private int pret;
    private ModPlata modPlata;

    public void platesteCalatorie(){
        modPlata.plateste(pret);
    }

    public Validator(int pret) {
        this.pret = pret;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}
