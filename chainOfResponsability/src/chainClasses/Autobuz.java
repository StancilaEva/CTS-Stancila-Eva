package chainClasses;

public class Autobuz extends MijlocTransportHandler{
    public Autobuz(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist<super.pragDist){
            System.out.println("Merge cu autobuzul");
        }
        else
            handler.deplaseazaRequest(dist);
    }
}
