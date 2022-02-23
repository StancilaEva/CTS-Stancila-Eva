package cts.seminar1.classes;

import cts.seminar1.classes.Animal;
import cts.seminar1.classes.IngrijitorZoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private IngrijitorZoo ingrijitorZoo;
    private List<Animal> animale;

    public Zoo(String nume, IngrijitorZoo ingrijitorZoo) {
        this.nume = nume;
        this.ingrijitorZoo = ingrijitorZoo;
        animale = new ArrayList<>();
    }

    public void adaugaAnimal(Animal a){
        animale.add(a);
    }

    public void hranesteAnimale(String hrana){
        for(Animal animal:animale){
            ingrijitorZoo.hranesteAnimal(animal,hrana);
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZoo getIngrijitorZoo() {
        return ingrijitorZoo;
    }

    public void setIngrijitorZoo(IngrijitorZoo ingrijitorZoo) {
        this.ingrijitorZoo = ingrijitorZoo;
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void setAnimale(List<Animal> animale) {
        this.animale = animale;
    }
}
