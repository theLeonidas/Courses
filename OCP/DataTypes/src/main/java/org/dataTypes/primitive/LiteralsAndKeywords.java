package org.dataTypes.primitive;

public class LiteralsAndKeywords {
    public static void main(String[] args) {
        //Use of underscore.
        int i1 = 1_0_0_0_000_00;
        System.out.println(i1);

        //A number without a decimal is considered an 'int' value.
        //Here 1000 is considered an int
        System.out.println(1000);

        //Below literal gives an error because a non decimal by default is an int
        //And int has a range and here we exceed that range which an int is not allowed to have.
        //Hence the error.
        //System.out.println(9999999999);

        //In order to make a numeric literal long or float
        //We need to suffix that literal with lower/uppercase
        //f and d respectively.

        System.out.println(9999999999d + 9999999999D);
        System.out.println(9.999999f + 9.999999999F);

        //Boolean literals
        System.out.println(true);
        System.out.println(false);

        //null literal
        String str = null;
    }
}