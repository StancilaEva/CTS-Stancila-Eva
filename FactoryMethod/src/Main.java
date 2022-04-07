public class Main {
    public static void main(String[] args) {
        Factory autobuzFactory = new AutobuzFactory();
        Autobuz autobuz = (Autobuz) autobuzFactory.creareMijloc("fhjaekdbfd");
        autobuz.toString();
        System.out.println(autobuz);
    }
}
