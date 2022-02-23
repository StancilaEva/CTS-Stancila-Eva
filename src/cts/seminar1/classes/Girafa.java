package cts.seminar1.classes;

import cts.seminar1.classes.Animal;

public class Girafa extends Animal {
    public Girafa(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {
System.out.print("Girafa "+getNume()+" mananca "+mancare);
    }
}
