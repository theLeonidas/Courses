package org.dataTypes.primitive;

public class IntInfo implements Display{

    @Override
    public void print() {
        System.out.println();
        System.out.println("Primitive type : int");
        System.out.println("Size : " + Integer.SIZE + " bits");
        System.out.println("Assignable range (" + Integer.MAX_VALUE + ") to (" + Integer.MIN_VALUE + ")");
        System.out.println("Possible values : (1,7,9,101)");
    }
}