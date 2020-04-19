package org.methods;

import java.io.FileNotFoundException;
import java.util.Random;

    public class InstanceInitializers {

    int intValue = 100;

    //Example of a instance initializer block
    {

        //Forward referencing & reading allowed here as intValue has already been declared
        //before the instance initializer block.
        anotherIntValue = intValue = 105;

        //Example of a forward reference that violates the declare-before-read rule.
        //If we try to access this compiler raises a illegal forward reference error.
        //intValue = anotherIntValue;

        //However del

        //No problems with the Forward referencing of a method.
        returnAValue();
        value = 5;
    }
    int value = 10;
    int anotherIntValue = 22;

    //Yet another instance initializer block.
    {
        anotherIntValue = 88;
    }
    char charValue;

    InstanceInitializers(){
    }

    int yetAnotherValue;

    private void returnAValue(){
        System.out.println(value);
    }

    public static void main(String[] args) {
        //This is not an example of Instance initializer block.
        //This is just a local block of code declared inside the main method.
        {
            System.out.println("I am a local block and not an instance initializer block.");
        }
        InstanceInitializers instanceInitializers = new InstanceInitializers();

        System.out.println(instanceInitializers.value);
        System.out.println(instanceInitializers.intValue);
        System.out.println(instanceInitializers.anotherIntValue);
        System.out.println(instanceInitializers.yetAnotherValue);
    }
}