package org.features;

public class StringImmutability implements Feature{

    @Override
    public void display() {

        //-------------------Immutability of String----------------------//
        String immutableString = "Java";
        String referringTheOriginalImmutableString = immutableString;
        immutableString += " is Object Oriented.";

        //referringTheOriginalImmutableString still points to the orogonal object.
        //While ImmutableString points to a new object with a new character sequence.
        System.out.println(referringTheOriginalImmutableString == immutableString);

        //Character sequence of the original string remains same.
        System.out.println(referringTheOriginalImmutableString);

        //ImmutableString reference points to a character sequence which is different as compared to the original String.
        System.out.println(immutableString);
    }
}