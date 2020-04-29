package org.inherit.abstracts;

//In the non-polymorphic world.
public class InefficientZoo {
    Cat[] cats = new Cat[5];
    Integer catIndx;

    Cow[] cows = new Cow[5];
    Integer cowIndx;

    Dog[] dogs = new Dog[5];
    Integer dogIndx;

    public void addCat(Cat cat){
        cats[catIndx++] = cat;
    }

    public void addCow(Cow cow){
        cows[cowIndx++] = cow;
    }

    public void addDog(Dog dog){
        dogs[dogIndx++] = dog;
    }

    public void shoutOut(){
        for (int i = 0;i<= catIndx;i++)
            cats[catIndx].speak();

        for (int i = 0;i<= cowIndx;i++)
            cows[cowIndx].speak();

        for (int i = 0;i<= dogIndx;i++)
            dogs[dogIndx].speak();
    }
}