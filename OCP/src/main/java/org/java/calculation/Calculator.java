package org.java.calculation;

import org.java.calculation.add.Addition;
import org.java.calculation.divide.Division;
import org.java.calculation.multiply.Multiplication;
import org.java.calculation.subtract.Subtraction;

//Multiple imports
//import org.java.calculation.add.*;

/*    1 : Addition
      2 : Subtraction
      3 : Multiply
      4 : Divide

  User Input :
          First String  : Operation
          Second & Third String : Numbers on which to perform operation.
* */
public class Calculator {
    public static void main(String[] args) {
        Float i1 = Float.parseFloat(args[1]);
        Float i2 = Float.parseFloat(args[2]);
        String operationId = args[0];
        String operationName = "";
        Result operationResult = null;

        if(operationId.equalsIgnoreCase("1")){
            operationName = "Addition";
            Addition addTwNumbers = new Addition(i1,i2);
            operationResult = addTwNumbers.add();
        }else if(operationId.equalsIgnoreCase("2")){
            operationName = "Subtraction";
            Subtraction subtractTwNumbers = new Subtraction(i1,i2);
            operationResult = subtractTwNumbers.subtract();
        }else if (operationId.equalsIgnoreCase("3")){
            operationName = "Multiplication";
            Multiplication multiplyTwoNumber = new Multiplication(i1,i2);
            operationResult = multiplyTwoNumber.multiply();
        }else{
            operationName = "Division";
            Division divideTwoNumbers = new Division(i1,i2);
            operationResult = divideTwoNumbers.divide();
        }

        System.out.println("Result of " + operationName + " of two numbers " + i1 +" and " + i2 + " is " + operationResult.getResult());
    }
}