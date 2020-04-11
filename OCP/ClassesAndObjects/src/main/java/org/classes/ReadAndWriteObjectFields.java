package org.classes;

public class ReadAndWriteObjectFields implements Feature{

    @Override
    public void displayFeature() {
        Person person = new Person();

        //Object methods & fields can be accessed using the dot(.) operator
        //Printing the raw person, prints all the default values.
        person.print();

        //Accessing & modifying the value of member variables.
        person.name = "Albert Einstein";
        person .age = 67;
        person.gender = "Male";

        //Calling the member method using the dot operator.
        person.print();
    }
}