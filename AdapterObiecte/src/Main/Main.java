package Main;

import AdapterClasses.*;

public class Main {
    public static void valideazaBilet(ValidatorTerestru validatorTerestru){
        validatorTerestru.valideazaBilet();
    }
    public static void main(String[] args) {
        ValidatorTerestru autobuz = new ValidatorAutobuz();
        ValideazaSubteran metrou =  new ValidatorMetrou();
        valideazaBilet(autobuz);
        Adapter adapter = new Adapter(metrou);
        valideazaBilet(adapter);
    }
}
