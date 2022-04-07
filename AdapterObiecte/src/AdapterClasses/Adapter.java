package AdapterClasses;

public class Adapter implements ValidatorTerestru{
      ValideazaSubteran validatorSubteran;

    public Adapter(ValideazaSubteran validatorSubteran) {
        this.validatorSubteran = validatorSubteran;
    }

    @Override
    public void valideazaBilet() {
        validatorSubteran.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorSubteran.valideazaAbonament();
    }


}
