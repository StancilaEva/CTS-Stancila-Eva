package Builder;

public class AutobuzBuilderV2 implements Builder{
    private String model;
    private String numeSofer;
    private String nrInmatriculare;
    private Boolean opresteCapatLinie;
    private Boolean deschideUsile;
    private String textAfisat;
    private Integer nrLinie;
    private Boolean isNew;
    @Override
    public Autobuz build() {
        return new Autobuz(model,numeSofer,nrInmatriculare,
                opresteCapatLinie,deschideUsile,
                textAfisat,nrLinie,isNew);
    }

    public AutobuzBuilderV2() {
        model="mercedes";
        numeSofer="DOREL";
        nrInmatriculare="RGSAGs";
        opresteCapatLinie = true;
        deschideUsile = true;
        textAfisat ="Buna ziua!";
        nrLinie = 44444;
        isNew = false;
    }

    public AutobuzBuilderV2 setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilderV2 setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilderV2 setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;
    }

    public AutobuzBuilderV2 setOpresteCapatLinie(Boolean opresteCapatLinie) {
        this.opresteCapatLinie = opresteCapatLinie;
        return this;
    }

    public AutobuzBuilderV2 setDeschideUsile(Boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public AutobuzBuilderV2 setTextAfisat(String textAfisat) {
        this.textAfisat = textAfisat;
        return this;
    }

    public AutobuzBuilderV2 setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
        return  this;
    }

    public AutobuzBuilderV2 setNew(Boolean aNew) {
        isNew = aNew;
        return this;
    }
}
