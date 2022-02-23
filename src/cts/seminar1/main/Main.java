package cts.seminar1.main;

import cts.seminar1.classes.Girafa;
import cts.seminar1.classes.IngrijitorZoo;
import cts.seminar1.classes.Zebra;
import cts.seminar1.classes.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("zoo1",new IngrijitorZoo("Georgica"));
        Zebra zebra1 = new Zebra("zebrica 1");
        Zebra zebra2 = new Zebra("zebrica 2");
        Girafa girafa1 = new Girafa("girafel 1");
        zoo.adaugaAnimal(zebra1);
        zoo.adaugaAnimal(zebra2);
        zoo.adaugaAnimal(girafa1);
        zoo.hranesteAnimale("ceva hrana");
    }
}
