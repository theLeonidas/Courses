package org.dataTypes.primitive;

public class BooleanInfo implements Display{

    @Override
    public void print() {
        System.out.println();
        System.out.println("Primitive type : boolean");
        System.out.println("Size : " + 1 + " bit");
        System.out.println("Allowed values : (" + Boolean.TRUE + " , " + Boolean.FALSE + ")");
    }
}