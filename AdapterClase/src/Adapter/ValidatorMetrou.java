package Adapter;

public class ValidatorMetrou implements ValideazaSubteran {
    @Override
    public void valideazaCalatorie() {
        System.out.println("Valideaza calatorie");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Valideaza Abonament");
    }
}
