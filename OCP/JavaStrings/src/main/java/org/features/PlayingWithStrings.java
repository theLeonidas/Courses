package org.features;

public class PlayingWithStrings implements Feature{

    @Override
    public void display() {
        //-------------------Playing with Strings---------------------------------//

        //Creates a blank String object
        String newString = new String();

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

        //Important methods of the String class.
        //Remember all indexes are zero based.
        String importantMethods = new String("I am Learning Java !!");

        //length() method of String class returns the length of the string.
        System.out.println("Length of blank String object = " + newString.length());

        //charAt(int indx) method returns character at the specified interest.
        //Prints the third character in the given string.
        System.out.println(importantMethods.charAt(3));

        //substring(int indx) returns a subpart of the original string starting at the specified indx.
        System.out.println(importantMethods.substring(5));
        System.out.println(importantMethods.substring(0,13));

        //indexOf(char ch/String str) finds the first occurrence of the given character of String.
        System.out.println(importantMethods.indexOf('J'));
        System.out.println(importantMethods.indexOf("Learning"));

        //----------------------------------------------------//
    }
}