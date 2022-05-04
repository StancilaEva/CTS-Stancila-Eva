package stateClasses;

public class LaReparat implements StareAutobuz{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            autobuz.setStare(this);
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" a ajuns la service");
        }
        else{
            System.out.println("Autobuzul nu este la capat de linie");
        }
    }
}
