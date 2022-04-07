package Main;

import Adapter.Adapter;
import Adapter.ValidatorAutobuz;
import Adapter.ValidatorTerestru;

public class Main {
    public static void main(String[] args) {
        ValidatorTerestru validatorTerestru = new ValidatorAutobuz();
        validatorTerestru.valideazaAbonament();
        validatorTerestru.valideazaBilet();
        Adapter validatorMetrou = new Adapter();
        validatorMetrou.valideazaBilet();
        validatorTerestru.valideazaAbonament();
        validatorMetrou.valideazaCalatorie();
    }
}
