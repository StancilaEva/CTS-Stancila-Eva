package AdapterClasses;

public class ValidatorAutobuz implements ValidatorTerestru{
    @Override
    public void valideazaBilet() {
        System.out.println("Valideaza Direct");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Valideaza Direct");
    }
}
