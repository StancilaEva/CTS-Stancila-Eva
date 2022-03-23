public class MicrobuzFactory implements Factory{
    @Override
    public MijlocTransportComun creareMijloc(String nrInmatriculare) {
        return new Microbuz(nrInmatriculare);
    }
}
