package org.methods;

import java.lang.reflect.Constructor;

public class Constructors implements Feature{


    @Override
    public void display() {

        System.out.println("Calling no argument default constructor.");
        //This example showcases the default constructor.
        //ClassWithDefaultConstructor class does not have any declared constructor
        //It utilizes the JVM provided default constructor which initializes the
        //members of the class to their default values.
        DefaultConstructor defaultConstructor = new DefaultConstructor();

        //This prints out the default values of the members of the class.
        System.out.println(defaultConstructor);
        System.out.println();

        //Calling explicit no argument constructor.
        MultipleConstructors noArgConstructor = new MultipleConstructors();
        System.out.println(noArgConstructor);
        System.out.println();

        //Calling other overloaded constructors.

        //Creating object using single argument constructor.
        MultipleConstructors oneArgConstructor = new MultipleConstructors(100);

        //Printing the object after initialization using single argument.
        System.out.println(oneArgConstructor);
        System.out.println();

        //Creating object using two argument constructor.
        MultipleConstructors twoArgConstructor = new MultipleConstructors(100, "I am learning Java.");

        //Printing the object after initialization using two arguments.
        System.out.println(twoArgConstructor);
        System.out.println();
    }
}