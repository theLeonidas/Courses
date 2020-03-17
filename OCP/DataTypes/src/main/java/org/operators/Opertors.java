package org.operators;

import jdk.nashorn.internal.runtime.BitVector;
import org.dataTypes.reference.ComplexType;

public class Opertors {
    public static void main(String[] args) {

        //Byte Operands.
        byte byteOperand1 = 10,byteOperand2 = 5;

        //Short Operands.
        short shortOperand1 = 10,shortOperand2 = 5;

        //Char Operands.
        short charOperand1 = 'A',charOperand2 = 'a';

        //Integer operands.
        int operand1 = 10,operand2 = 5;

        //Long Operands.
        long longOperand1 = 10,longOperand2 = 5;

        //Float Operands.
        float floatOperand1 = 10.9f,floatOperand2 = 5.4f;

        //Double Operands.
        double doubleOperand1 = 10,doubleOperand2 = 5;

        //Boolean Operands.
        boolean booleanOperand1 = true,booleanOperand2 = false;

        //Complex types
        ComplexType complexTypeOperand1 = new ComplexType(), complexTypeOperand2 = new ComplexType();

        //Arithmetic operators
        System.out.println("Operand1 = " + operand1 + " , Operand2 = " + operand2);

        //Addition
        int addOperation = operand1 + operand2;
        System.out.println("Result of Add Operation = " + addOperation);

        //Subtraction.
        int subtractionOperation = operand1 - operand2;
        System.out.println("Result of Subtraction Operation = " + subtractionOperation);

        //Division.
        int divisionOperation = operand1 / operand2;
        System.out.println("Result of Division Operation = " + divisionOperation);

        //Multiplication.
        int multiplicationOperation = operand1 * operand2;
        System.out.println("Result of Division Operation = " + divisionOperation);

        //Modulus.
        //This is the remainder operator.
        int modulusOperation = operand1 % operand2;
        System.out.println("Result of Modulus Operation = " + modulusOperation);

        System.out.println();

        //Unary pre increment/decrement.
        System.out.println("Value of operand 1 before pre increment = " + operand1);
        ++operand1;
        System.out.println("Value of operand 1 after pre increment = " + operand1);

        System.out.println("Value of operand 1 before pre decrement = " + operand1);
        --operand1;
        System.out.println("Value of operand 1 after pre decrement = " + operand1);

        System.out.println();

        //Unary post increment/decrement.
        System.out.println("Value of operand 1 before post increment = " + operand1);
        operand1++;
        System.out.println("Value of operand 1 after post increment = " + operand1);

        System.out.println("Value of operand 1 before post decrement = " + operand1);
        operand1--;
        System.out.println("Value of operand 1 after post decrement = " + operand1);

        //Relational operators
        //Applying relational operators on operands results in
        //a boolean value

        //Less than, greater than.
        boolean isGreater = operand1 > operand2;
        boolean isSmaller = operand1 < operand2;

        //Equal & Not Equal

        //Integer equality.
        boolean isIntegerEqual = operand1 == operand2;
        boolean isIntegerNotEqual = operand1 != operand2;

        //Character equality.
        boolean isCharacterEqual = charOperand1 == charOperand2;
        boolean isCharacterNotEqual = charOperand1 != charOperand2;

        //Float equality.
        boolean isFloatEqual = floatOperand1 == 10.9f;
        boolean isFloatNotEqual = floatOperand1 == 1111;

        //Comparing incompatible types.
        //boolean incompatibleComparison = byteOperand1 == booleanOperand1;
        //boolean incompatibleTypes = floatOperand1 == complexTypeOperand1;

        //Short circuiting AND(&&)
        boolean iAmHungry = false;
        boolean canIEatPizza = iAmHungry & isNearByDominosOpen();

        //Non Short Circuiting AND(&).
        canIEatPizza = iAmHungry & isNearByDominosOpen();

        //Short circuiting OR(||).
        boolean isPizzaAvailable = false, isBurgerAvailable = true;
        boolean willMyHungerBeSatisfied = isPizzaAvailable || isBurgerAvailable || isHotDogAvailable();

        //Non Short circuiting OR(|).
        willMyHungerBeSatisfied = isPizzaAvailable | isBurgerAvailable | isHotDogAvailable();

        //Exclusive OR or XOR.
        boolean X = true, Y= false;
        boolean result = X^Y;
        System.out.println(result);

        //Negation operator.
        boolean isHungry = false;
        boolean canIEatHotDog = !isHungry;

        //Ternary Operators.
        int burgers = 5;
        boolean canIHaveAMeal = (burgers > 0  ? true : false);

        //Assignment Operator.
        int hotDogs = 3;
        char firstCharacterOfName = 'S';

        //Compound assignment.
        int compoundAssignment = 0;
        String strCompoundAssignment = "Hello !! ";

        //Below is equivalent to addCompoundAssignment = addCompoundAssignment + operand1;
        compoundAssignment += operand1;

        //Below is equivalent to compoundAssignment = compoundAssignment / operand1;
        compoundAssignment /= operand1;

        //Also works for strings.
        //Evaluates as strCompoundAssignment = strCompoundAssignment + <Text>
        strCompoundAssignment += "This is an OCP course.";

        //Boolean compound assignment.
        boolean boolCompoundAssignment = true;
        boolCompoundAssignment &= false;

        //Bitwise operators => AND/OR/XOR
        int b1 = 1, b2 = 7, b3;

        b3 = b1 & b2;
        System.out.println("Result of bitwise AND operator = " + b3);

        b3 = b1 | b2;
        System.out.println("Result of bitwise OR operator = " + b3);

        b3 = b1 ^ b2;
        System.out.println("Result of bitwise XOR operator = " + b3);

        b3 = ~b2;
        System.out.println("Result of bitwise complement operator = " + b3);

        //Bitwise left & right shift operators.
        b3 = b1 >> 1;
        System.out.println("Result of bitwise right shift operator = " + b3);


        b3 = b1 << 1;
        System.out.println("Result of bitwise left shift operator = " + b3);

        //Unsigned right shift.
        //Does the same as right shift operator except that it
        //does not preserve the sign of the number.
        b3 = -b2 >>> 1;
        System.out.println("Result of bitwise logical right shift operator = " + b3);

    }

    public static boolean isNearByDominosOpen(){
        System.out.println("Near by Dominos is open...");
        return true;
    }

    public static boolean isHotDogAvailable(){
        System.out.println("Hot dog is available..");
        return true;
    }
}