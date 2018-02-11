package com.programowanie.observer;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private List<AnimalAddedListener> listeners = new ArrayList<>();

    public void addAnimal(Animal animal){
        this.animals.add(animal);
        this.notifyAnimal(animal);
    }

    public void removeAnimal(String animal){
        for (int i=0; i<this.animals.size();i++) {
            if (animal == this.animals.get(i).getName()){
                this.animals.remove(i);
                this.subNotifyAnimal(animal);
                break;
            }
        }
    }

    private void subNotifyAnimal(String animal) {
        this.listeners.forEach(listener->listener.onAnimalSub(animal));
    }

    public void registerAnimalAddedListener
            (AnimalAddedListener animalAddedListener){
        this.listeners.add(animalAddedListener);
    }

    public void unregisterAnimalAddedListener
            (AnimalAddedListener animalAddedListener){
        this.listeners.remove(animalAddedListener);
    }

    public void notifyAnimal(Animal animal){
        this.listeners.forEach(listener->listener.onAnimalAdded(animal));
    }

    public void quantityOfZoo(){
        System.out.println("\nAktualny stan ZOO");
        this.animals.forEach(animal-> System.out.print(animal.getName()+", "));
        System.out.println("\n");
    }
}
