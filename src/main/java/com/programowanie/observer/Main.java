package com.programowanie.observer;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.registerAnimalAddedListener(new Visitor());

        zoo.addAnimal(new Animal("Słoń"));
        zoo.addAnimal(new Animal("Zebra"));

    }
}
