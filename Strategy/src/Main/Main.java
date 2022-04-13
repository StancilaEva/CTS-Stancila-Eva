package Main;

import StrategyClasses.CardBancar;
import StrategyClasses.CardCalatorii;
import StrategyClasses.SMS;
import StrategyClasses.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(12);
        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie();
        validator.setModPlata(new SMS());
        validator.platesteCalatorie();
        validator.setModPlata(new CardCalatorii());
        validator.platesteCalatorie();
    }
}
