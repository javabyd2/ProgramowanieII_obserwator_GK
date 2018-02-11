package com.programowanie.observer;

public class CTO implements AnimalAddedListener{
    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Nowy: "+animal.getName()+" -> CTO");
    }

    @Override
    public void onAnimalSub(String animal) {
        System.out.println("Odszedł: "+animal+" -> CTO");
    }
}
