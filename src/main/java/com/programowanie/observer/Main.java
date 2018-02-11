package com.programowanie.observer;

import javafx.fxml.FXMLLoader;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // listenerzy
        CTO c = new CTO();
        zoo.registerAnimalAddedListener(c);
        Visitor visitor = new Visitor();
        zoo.registerAnimalAddedListener(visitor);

        zoo.addAnimal(new Animal("Słoń"));
        zoo.addAnimal(new Animal("Zebra"));
        zoo.addAnimal(new Animal("Zebra"));
        zoo.addAnimal(new Animal("Zebra"));
        zoo.addAnimal(new Animal("Zebra"));
        zoo.unregisterAnimalAddedListener(c);
        zoo.addAnimal(new Animal("Żyrafa"));
        zoo.addAnimal(new Animal("Lew"));
        zoo.quantityOfZoo();

        zoo.removeAnimal("Zebra");
        zoo.quantityOfZoo();

    }
}
