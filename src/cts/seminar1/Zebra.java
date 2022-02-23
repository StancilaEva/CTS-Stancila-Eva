package cts.seminar1;

public class Zebra extends Animal{
    public Zebra(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {
        System.out.println("Zebra "+getNume()+" mananca "+mancare);
    }
}
