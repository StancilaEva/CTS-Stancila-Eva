package templateClasses;

public class TramvaiProba extends TramvaiAbstract{
    @Override
    protected void opresteStatie1() {
        System.out.println("opreste statie 1");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("nu opreste statie 2");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("opreste statie 3");
    }
}
