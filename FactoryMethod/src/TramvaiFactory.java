public class TramvaiFactory implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
