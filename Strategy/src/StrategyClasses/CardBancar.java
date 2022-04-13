package StrategyClasses;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(int suma) {
        System.out.println("s-a platit prin card bancar suma de "+suma);
    }
}
