package StrategyClasses;

public class SMS implements ModPlata{
    @Override
    public void plateste(int suma) {
        System.out.println("s-a platit prin sms suma de "+suma );
    }
}
