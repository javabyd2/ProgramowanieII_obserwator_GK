package com.programowanie.observer;

public class Visitor implements AnimalAddedListener{
    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Nowy: "+animal.getName());
    }
}
