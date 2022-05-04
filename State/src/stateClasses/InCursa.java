package stateClasses;

public class InCursa implements StareAutobuz{

    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            autobuz.setStare(this);
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" este in cursa");
        }
        else{
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate pleca in cursa deoarece nu este la capat de linie");
        }
    }
}
