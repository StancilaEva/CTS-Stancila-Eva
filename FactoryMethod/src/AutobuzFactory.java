public class AutobuzFactory implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
