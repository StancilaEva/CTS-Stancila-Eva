public class TroleibuzFactory implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
