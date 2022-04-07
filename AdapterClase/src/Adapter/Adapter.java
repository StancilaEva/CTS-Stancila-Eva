package Adapter;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru{
    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }
}
