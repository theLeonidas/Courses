package org.dataTypes.primitive;

public class DoubleInfo implements Display{

    @Override
    public void print() {
        System.out.println();
        System.out.println("Primitive type : float");
        System.out.println("Size : " + Double.SIZE + " bits");
        System.out.println("Assignable range (" + Double.MAX_VALUE + ") to (" + Double.MIN_VALUE + ")");
        System.out.println("Possible values : (" + 1.34d + " , " + 666.23456d + " , " + 2012.444d + ")");
    }
}