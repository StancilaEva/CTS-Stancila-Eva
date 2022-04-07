package Builder;

public class Autobuz {
    private String model;
    private String numeSofer;
    private String nrInmatriculare;
    private Boolean opresteCapatLinie;
    private Boolean deschideUsile;
    private String textAfisat;
    private Integer nrLinie;
    private Boolean isNew;

    public Autobuz() {
        model="mercedes";
        numeSofer="DOREL";
        nrInmatriculare="RGSAGs";
        opresteCapatLinie = true;
        deschideUsile = true;
        textAfisat ="Buna ziua!";
        nrLinie = 44444;
        isNew = false;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", opresteCapatLinie=").append(opresteCapatLinie);
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", textAfisat='").append(textAfisat).append('\'');
        sb.append(", nrLinie=").append(nrLinie);
        sb.append(", isNew=").append(isNew);
        sb.append('}');
        return sb.toString();
    }

    public Autobuz(String model, String numeSofer, String nrInmatriculare, Boolean opresteCapatLinie, Boolean deschideUsile, String textAfisat, Integer nrLinie, Boolean isNew) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.nrInmatriculare = nrInmatriculare;
        this.opresteCapatLinie = opresteCapatLinie;
        this.deschideUsile = deschideUsile;
        this.textAfisat = textAfisat;
        this.nrLinie = nrLinie;
        this.isNew = isNew;
    }

     void setModel(String model) {
        this.model = model;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

     void setOpresteCapatLinie(Boolean opresteCapatLinie) {
        this.opresteCapatLinie = opresteCapatLinie;
    }

     void setDeschideUsile(Boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    public void setTextAfisat(String textAfisat) {
        this.textAfisat = textAfisat;
    }

     void setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
    }

     void setNew(Boolean aNew) {
        isNew = aNew;
    }

}
