package chainClasses;

public class Tramvai extends MijlocTransportHandler {
    public Tramvai(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist<super.pragDist){
            System.out.println("Merge cu tramvaiul");
        }
        else{
            handler.deplaseazaRequest(dist);
        }
    }
}
