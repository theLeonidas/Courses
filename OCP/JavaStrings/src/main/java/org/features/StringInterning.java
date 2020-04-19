package org.features;

public class StringInterning implements Feature{
    @Override
    public void display() {

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
        System.out.println(internedString == nonInterndString);

        //String class also provides a method intern() which converts a non-interned String to an interned String using.
        String convertedString = nonInterndString.intern();
        System.out.println(internedString == convertedString);

        //----------------------------------------------------------//
    }
}