package org.dataTypes.primitive;

public class CharInfo implements Display{

    @Override
    public void print() {
        System.out.println();
        System.out.println("Primitive type : char (unsigned integer)");
        System.out.println("Size : " + Character.SIZE + " bits");
        System.out.println("Possible values : (/ , [ , ])");
    }
}