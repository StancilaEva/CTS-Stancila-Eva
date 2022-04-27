package chainClasses;

public class Troleibuz extends MijlocTransportHandler{
    public Troleibuz(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist<super.pragDist){
            System.out.println("Merge cu troleibuzul");
        }
        else{
            handler.deplaseazaRequest(dist);
        }
    }
}
