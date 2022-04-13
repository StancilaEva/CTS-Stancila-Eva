package ProxyClasses;

public class AutobuzDeNoapte implements MijlocTransport{
    private MijlocTransport autobuz;

    public AutobuzDeNoapte(MijlocTransport autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteStatie() {
        if(((Autobuz)autobuz).getNrCalatori()>0){
            autobuz.opresteStatie();  //poti face o clasa abstracta din mijloc transport si ii dai nrCalatori
        }
        else{
            System.out.println("nu se va opri in statie deoarece autobuzul nu are calatori");
        }
    }


}
