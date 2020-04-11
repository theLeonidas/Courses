package org.classes;

public class DeclareAndInstantiate {
    public static void main(String[] args) {

        //Declaration
        Person simplePerson, complexPerson, tallPerson, shortPerson;

        //Incorrect declaration.
        //Person p1, Object o1, String s1;

        //Decaration & assignment
        Person person = null, newPerson = null, smallPerson = new Person();

        //Instantiating an object.
        Person instanceOfAPerson = new Person();
        Object newObject = new Object();

        //Strings have a special treatment in java.
        String name = new String("Albert Einstein");
        String courseName = "OCP Java SE 11 Programmer I";

        //Objects with no reference to point.
        //These objects are created on heap but do not have any reference
        //pointing to them. So these objects cannot be referred to once the main method completes.
        //Infact these objects cannot be referred to once we goto the next line.
        new Person();
        new String("OCP");
        new Object();
    }
}