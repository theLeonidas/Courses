package org.operators;

public class BinaryPromotion implements Operators{

    @Override
    public void testOperator() {
        displayErrors();

        //Operands of different types
        byte op1 = 25;
        int op2 = 23;
        long op3 = 56;
        float op4 = 34.6f;
        double op5 = 654.33;
        short op6 = 123;

        //byte to float
        //Promotion happens from byte to float and then addition happens
        //This fails as this is a narrowing operation and hence needs an explicit cast.
        //byte byteResult = op1 + op4;

        //This passes as per the rules of numeric promotion.
        //op1 which is a byte operand is promoted to a float value
        //as op4 is of type float which is larger.
        float floatResult = op1 + op4;
        System.out.println(floatResult);

        //byte to int
        //This gives compiler error as here due to numeric promotion rules
        //op1,which is byte type,is promoted to op2 which is of int type
        //and the result is of type int.This int type is getting assigned to a byte type
        //This is a narrowing process and hence the compiler raises an exception.
        //byte byteResult = op1 + op2;

        //Correct way of implementing the above operation.
        byte byteResult = (byte) (op1 + op2);

        //int to float promotion.
        //int intResult = op2 + op4;

        //Guess what happens ?
        //short s1 = op6 + op1;
    }

    private void displayErrors() {
        //Correct way of writing this is by casting.
        byte b1 = 1, b2 = 2;
    }
}