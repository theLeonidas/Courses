package org.dataTypes.primitive;

public class FloatInfo implements Display{

    @Override
    public void print() {
        System.out.println();
        System.out.println("Primitive type : float");
        System.out.println("Size : " + Float.SIZE + " bits");
        System.out.println("Assignable range (" + Float.MAX_VALUE + ") to (" + Float.MIN_VALUE + ")");
        System.out.println("Possible values : (" + 1.34f + " , " + 666.23456f + " , " + 2012.444f + ")");
    }
}