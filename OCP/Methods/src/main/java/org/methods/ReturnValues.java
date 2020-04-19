package org.methods;

import java.util.Arrays;

public class ReturnValues implements Feature{

    @Override
    public void display() {
        functionReturningVoid();
        thisMethodReturnsAClassType();
        thisMethodTestsNumericPromotionInReturnType();
        thisMethodTestsAutoboxing();
        anotherMethodThatTestsAutoboxing();
        methodShowingReturnStatementMustBeUnambiguous();
    }

    //This method declares its return type as void.
    //This means that it does not return anything.
    public void functionReturningVoid(){
        if("I am learning Java"!=null)
            System.out.println("Hurary !!");
        else System.out.println("I am bored !!");

        //Even returning void is not allowed.
        //return void;

        //However empty return statements can be written.
        return;
    }

    public Feature thisMethodReturnsAClassType(){
        if("You want to learn Java"!=null)
            return System.out::println;
        else return null;
    }
    public int thisMethodTestsNumericPromotionInReturnType(String ...str){
        Arrays.stream(str).forEach(System.out::println);
        byte byteType = 23;
        short shortType = 56;
        char charType = 34;

        //All return types below are valid.
        return byteType;
//        return shortType;
//        return charType;
    }

    public Integer thisMethodTestsAutoboxing(){
        int intType = 68;

        //Autoboxing takes place automatically.
        return intType;
    }

    public short anotherMethodThatTestsAutoboxing(){
        Short shortType = 68;

        //Autoboxing takes place automatically.
        return shortType;
    }

    public double methodShowingReturnStatementMustBeUnambiguous(){
        boolean isReturn = false;
        return 34.5;
        //Compiler tries to ensures that in all conditions method returns a value.
        //If the compiler cannot determine whether 'isReturn' is true or false
        //then it could be possible that flow enters else statement
        //And there is no return statement which can result in method returning no value
        //Which is wrong.Hence compiler flags this at compile time.
//        if(isReturn)
//            return 3.5;
//        else System.out.println();
    }
}