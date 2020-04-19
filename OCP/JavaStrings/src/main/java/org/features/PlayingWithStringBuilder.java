package org.features;

public class PlayingWithStringBuilder implements Feature{
    @Override
    public void display() {

        //-------------------StringBuilder----------------------//

        //StringBuilder represents the mutable version of the String class.
        StringBuilder builder = new StringBuilder("I am learning ");
        StringBuilder pointerToOriginalStringBuilder = builder;

        //builder and pointerToOriginalStringBuilder still point to the same object.
        //even after the original object was changed.
        //This proves that StringBuilder are mutable versions of String.
        builder.append("Java");

        //Checking the above.
        System.out.println(builder == pointerToOriginalStringBuilder);
        System.out.println(builder.equals(pointerToOriginalStringBuilder));
    }
}