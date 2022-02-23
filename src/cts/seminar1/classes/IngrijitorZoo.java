package cts.seminar1.classes;

import cts.seminar1.classes.Animal;

public class IngrijitorZoo {
    private String nume;
    public void hranesteAnimal(Animal animal, String mancare){
        animal.mananca(mancare);
    }

    public IngrijitorZoo(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
