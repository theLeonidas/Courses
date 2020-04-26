package org.inherit;

public class ParentX {

    {
        System.out.println("Initializing parent class.");
    }

    //Stores the name of all its child classes.
    private String[] childNames = new String[10];

    //Default No-Arg constructor.
    ParentX(){}

    ParentX(String childName){
        //Object class default no-arg constructor called invisibly.
        System.out.println("Parent class parameterized constructor called.");
        //Adding child class name.
        childNames[childNames.length-1] = childName;
    }
}