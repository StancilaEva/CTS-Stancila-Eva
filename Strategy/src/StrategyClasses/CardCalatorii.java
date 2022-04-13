package StrategyClasses;

public class CardCalatorii implements ModPlata{
    @Override
    public void plateste(int suma) {
        System.out.println("s-a platit prin cardul de calatorii suma de "+suma);
    }
}
