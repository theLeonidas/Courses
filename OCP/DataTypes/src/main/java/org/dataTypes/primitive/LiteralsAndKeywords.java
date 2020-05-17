package org.dataTypes.primitive;

public class LiteralsAndKeywords {
    public static void main(String[] args) {
        //Use of underscore.
//        int i1 = 1_0_0_0_000_00;
//        System.out.println(i1);
//
//        //A number without a decimal is considered an 'int' value.
//        //Here 1000 is considered an int
//        System.out.println(1000);
//
//        //Range of byte : -128 <-> 127
//        byte b1 = 100;
//
//        //Since integral literals default to int , so here literal 128 is an int data.
//        //Out of range of byte.Trying to assign a larger value than can be assigned to byte.
//        //byte b2 = 128;
//
//        //Similarly for short.
//        short s1 = 129;
//
//        //Trying to assign a value larger than the range of short.
//        //short s2 = 32768;
//
//        //For long values
//        long l1 = 2147483647;
//
//        //long l2 = 2147483648;
//
//        //Correct way of writing long literals.
//        long l3 = 21474836498l;
//
//        //In order to make a numeric literal long or float
//        //We need to suffix that literal with lower/uppercase
//        //f and d respectively.
//
//
//        //Default is double.
//        double d1 = 32323.3232323;
//
//        //Denote a floating point literal.
//        //By default its double if we use the literal as it is without any suffix.
//        //float f1 = 3.32323232323;
//        float f2 = 3.32323232323f;
//
//        double d2 = 2323.23233d;
//
//        //Boolean literals
//        System.out.println(true);
//        System.out.println(false);
//
//        //null literal
//        String str = null;
//
//        //Octal numbers.
//        int i3 = 011;
//        System.out.println(i3);

        int i3 = 0x11;
        System.out.println(i3);
    }
}