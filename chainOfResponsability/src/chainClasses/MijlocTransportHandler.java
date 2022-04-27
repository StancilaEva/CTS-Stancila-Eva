package chainClasses;

public abstract class MijlocTransportHandler {
    protected MijlocTransportHandler handler;

    protected int pragDist;

    public MijlocTransportHandler() {

    }

    public MijlocTransportHandler(int pragDist) {
        this.pragDist = pragDist;
    }

    public void setHandler(MijlocTransportHandler handler) {
        this.handler = handler;
    }

    public MijlocTransportHandler getHandler() {
        return handler;
    }

    public abstract void deplaseazaRequest(int dist);
}
