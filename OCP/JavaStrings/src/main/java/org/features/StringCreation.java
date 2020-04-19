package org.features;

public class StringCreation implements Feature{

    @Override
    public void display() {
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
    }
}