package org.inherit.abstracts;

public abstract class Animal {
    //Every animal breathes
    boolean inHale;

    //Every animal breathes.
    public void breath(){
        inHale=!inHale;
    }

    //This is an abstract method.
    public abstract void speak();
}