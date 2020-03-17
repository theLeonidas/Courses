package org.dataTypes.primitive;

public class ConditonalAssignment {
    public static void main(String[] args) {
        int i1 = 0;
        byte b1;

        //In this example if only if block is open then
        //the print statement complains of variable b1 may not be initialized
        //On the other hand if we enable else block as well then the compiler doesnt complain the same.
        if(i1==0)
            b1 = 0;
//        else b1 = 10;
//
//        System.out.println("Value of b1 = " + b1);
    }
}