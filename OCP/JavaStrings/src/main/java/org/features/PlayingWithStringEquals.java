package org.features;

public class PlayingWithStringEquals implements Feature{
    @Override
    public void display() {

        //----------------------equals() method.------------------------------//
        //Object class contains a method equals().Default implementation of equals()
        //checks whether two references point to the same object.
        //String class implements equals() method and checks whether the objects have
        //the same character sequence.If they contain the saem character sequence then it returns true
        //otherwise false.

        String objectWithSameCharSequence = "Java";
        String anotherObjectWithSameCharSequence = "Java";
        String objectWithDiffCharSequence = "Not Java";

        //Though these are two different object still they have the same charcter sequence,
        //hence equals() method returns true;
        System.out.println(objectWithSameCharSequence.equals(anotherObjectWithSameCharSequence));

        //Here both the references points to different objects and they contain different character sequence.
        System.out.println(objectWithSameCharSequence.equals(objectWithDiffCharSequence));
        //----------------------------------------------------//
    }
}