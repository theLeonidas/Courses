package org.dataTypes.primitive;

public class LongInfo implements Display{

    @Override
    public void print() {
        System.out.println();
        System.out.println("Primitive type : long");
        System.out.println("Size : " + Long.SIZE + " bits");
        System.out.println("Assignable range (" + Long.MAX_VALUE + ") to (" + Long.MIN_VALUE + ")");
        System.out.println("Possible values : (1,7,9,101)");
    }
}