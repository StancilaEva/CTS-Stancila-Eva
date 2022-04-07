package Facade;

public class AutobuzFacade {
    Autbouz autobuz;

    public AutobuzFacade(Autbouz autobuz) {
        this.autobuz = autobuz;
    }

    public void deschideUsa(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void liberUsa(){
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.deschideUsaSpate();
    }
}
