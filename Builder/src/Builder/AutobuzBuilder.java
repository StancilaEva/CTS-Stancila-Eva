package Builder;

public class AutobuzBuilder implements Builder{
    private Autobuz autobuz;

    public AutobuzBuilder() {
        autobuz = new Autobuz();
    }

    protected AutobuzBuilder setModel(String model) {
        autobuz.setModel(model);
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        autobuz.setNrInmatriculare(nrInmatriculare);
        return this;
    }

    public AutobuzBuilder setOpresteCapatLinie(Boolean opresteCapatLinie) {
        autobuz.setOpresteCapatLinie(opresteCapatLinie) ;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(Boolean deschideUsile) {
        autobuz.setDeschideUsile(deschideUsile); ;
        return this;
    }

    public AutobuzBuilder setTextAfisat(String textAfisat) {
        autobuz.setTextAfisat(textAfisat); ;
        return this;
    }

    public AutobuzBuilder setNrLinie(Integer nrLinie) {
        autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setNew(Boolean aNew) {
        autobuz.setNew(aNew);
        return this;
    }


    @Override
    public Autobuz build() {
        return autobuz;
    }
}
