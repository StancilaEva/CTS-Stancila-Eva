package commandClasses;

public class Autobuz {
    private int nrInmatriculare;

    public Autobuz(int nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void plecarePeTraseu(int linie){
        System.out.println("Autobuzul cu nr-ul: "+nrInmatriculare+" a plecat pe linia "+linie);
    }
}
