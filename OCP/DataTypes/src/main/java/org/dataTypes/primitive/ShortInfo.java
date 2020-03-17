package org.dataTypes.primitive;

public class ShortInfo implements Display{

    @Override
    public void print() {
        System.out.println();
        System.out.println("Primitive type : short");
        System.out.println("Size : " + Short.SIZE + " bits");
        System.out.println("Assignable range (" + Short.MAX_VALUE + ") to (" + Short.MIN_VALUE + ")");
    }
}