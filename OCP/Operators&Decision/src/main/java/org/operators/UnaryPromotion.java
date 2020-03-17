package org.operators;

public class UnaryPromotion implements Operators{
    @Override
    public void testOperator() {
        displayErrors();

        short s1 = 123;

        //Guess  the outcome.
        //short s2 = +s1;
        //int i1 = -s2;
        //byte b2 = s1 & i1;

        //Here no cast is required as no promotion happens here
        //Since value of i1 is already known at the compile time due it being
        //a compile time constant hence compiler can calculate value of expression
        //on the right hand side of the assignment , hence can determine whether
        // it lies within the range of type being assigned to.
        final int i1 = 34;
        //byte b1 = i1 + 99;

        //Numeric promotions do not work on compound assignments.
        //Below is an example.
        byte b2 =10;
        byte b1 = ++b2;
    }

    private void displayErrors() {
        //This causes an error as here numeric promotion rule apply.
        //byte b1 = 1;
        //short s1 = -b1;

        //Correct way of writing this is by casting.
        //short s1 = (short) -b1;
    }
}
