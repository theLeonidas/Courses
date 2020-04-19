package org.features;

import org.StringFeatures;

public class PlayignWithToString implements Feature{
    @Override
    public void display() {

        //----------------------toString() method.------------------------------//

        //Every class inherits the Object class. Object class has a method named toString().
        StringFeatures features = new StringFeatures();

        //By default toString() returns <Fully Qualified Name of the class>@unique hash code value of the object.
        //System.out.println() by default calls toString() method on Objects.
        System.out.println(features);

        //Same as above.
        System.out.println(features.toString());

        System.out.println();

        //String class overrides the toString() method and returns the String object itself.
        String thisStringShowsToStringMethodImplementation = "I am learning Java 11 !!";
        System.out.println(thisStringShowsToStringMethodImplementation.toString());

        //----------------------------------------------------//
    }
}