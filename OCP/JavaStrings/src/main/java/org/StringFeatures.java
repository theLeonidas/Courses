package org;

import com.sun.org.apache.xpath.internal.SourceTree;

public class StringFeatures {
    public void display(){

        //--------------------Ways of creating String--------------------------------//
        String string = "OCP";
        String assignedString = string;

        //Available String constructors.
        //Creates a blank String object
        String newString = new String();

        //Constructor with a String object.
        String nonInternString = new String("OCP");

        //Constructing String from another string.
        String stringFromAnotherString = new String(nonInternString);

        //Constructing using a char array.
        char charArray [] = {'J','A','V','A'};
        String stringFromCharArray = new String(charArray);
        System.out.println("String from character array is : " + stringFromCharArray);

        //----------------------------------------------------//

        //-------------------Playing with Strings---------------------------------//

        //length() method of String class returns the length of the string.
        System.out.println("Length of blank String object = " + newString.length());

        //'+' operator is overloaded in case of String to perform concatenation.
        String addedString = "O" + "CP";

        //toString() method of Object class is invoked to convert 11 to a String and then appended to OCP.
        String numberString = "OCP" + 11;

        //String operations are evaluated from left to right.
        String additionString = 1 + 2 + "3" ;
        String anotherAdditionString = "1" + 2 + 3 ;
        String yetAnotherAdditionString = "1" + "2" + 3 ;
        System.out.println(additionString + " , " + anotherAdditionString + " , " + yetAnotherAdditionString);

        String nullConcatenatedString = "OCP is " + null;
        Object myValueIsNull = null;
        String anotherNullConcatenatedString = "OCP is " + myValueIsNull;
        System.out.println(nullConcatenatedString +" , " + anotherNullConcatenatedString);

        //----------------------------------------------------//

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

        //-------------------Interning of String---------------------------------//
        String internedString = "OCP";
        String anotherInternedString = "OCP";
        String nonInternedString = new String("OCP");
        System.out.println();

        //Checking the actual Objects.
        //Since internedString , anotherInternedString both have the same character patttern they point to the same object
        //which is created in the string pool.
        System.out.println(internedString == anotherInternedString);

        //String Object created using the new operator are not interned.
        //internedString Object is created in the string pool part of the heap
        // while nonInternedString is created in the normal heap.
        //Hence below statement should return false.
        System.out.println(internedString == nonInternedString);

        //Other ways of interning a String.
        String anotherWayOfInterning = "O" + "CP";
        System.out.println(internedString == anotherWayOfInterning);


        String oString = "O";
        String cpString = "CP";
        String combinedString = oString + cpString;

        //This does not create an interned String.
        //Because value of result cannot be determined at compile time but only at runtime.
        System.out.println(combinedString == internedString);

        //Ways of creating non-interned String.

        //Strings created using new operator are not interned.
        String nonInterndString = new String("OCP");
        System.out.println(string == nonInterndString);

        //String class also provides a method intern() which converts a non-interned String to an interned String using.
        String convertedString = nonInterndString.intern();
        System.out.println(string == convertedString);

        //-------------------Immutability Strings---------------------------------//
    }
}