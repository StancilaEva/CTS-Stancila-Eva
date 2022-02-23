package cts.seminar1;

public class Girafa extends Animal{
    public Girafa(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {
System.out.print("Girafa "+getNume()+" mananca "+mancare);
    }
}
