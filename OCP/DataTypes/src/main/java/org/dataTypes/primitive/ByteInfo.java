package org.dataTypes.primitive;

public class ByteInfo implements Display{

    @Override
    public void print() {
        System.out.println();
        System.out.println("Primitive type : byte");
        System.out.println("Size : " + Byte.SIZE + " bits");
        System.out.println("Assignable range (" + Byte.MAX_VALUE + ") to (" + Byte.MIN_VALUE + ")");
        System.out.println("Possible values : (1,2,6,56,99)");
        //This is allowed as within byte range.
        //byte b = 120;

        //This is not allowed as outside of byte range.
        //Compiler treats 128 as an integer and we are trying to assign it ot a byte
        // which happens to be a of a smaller size. Hence a cast is needed.
        // byte b = 128;

        //This works perfectly.
        //Guess what will be the value in variable b ?
        // byte b = (byte)128;
    }
}