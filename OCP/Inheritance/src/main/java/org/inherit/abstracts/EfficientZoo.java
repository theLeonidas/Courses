package org.inherit.abstracts;

import java.util.Arrays;

//In a polymorphic world
public class EfficientZoo {

    //A Single array can handle all the animal types.
    private Animal[] zoo = new Animal[20];

    //A single method can handle addition of all types of animals.
    public void addAnimal(Animal animal){
        zoo[zoo.length-1] = animal;
    }

    //Thanks to polymorphism we can now refer all animal types using the
    //parent class reference.
    //Reduces the overall code.
    public void shoutOut(){
        Arrays.stream(zoo)
              .forEach(animal -> animal.speak());
    }
}