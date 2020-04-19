package org.exception;

import java.util.Arrays;

public class Exceptions implements Feature{

    @Override
    public void display() throws Exception {

        //Default exception handling mechanism.
        printStackTrace();

        //USe of try-catch block.
        //handlingAnExceptionLocally();
    }

    private void printStackTrace()throws Exception {
        StackTrace.print();
}

    private void handlingAnExceptionLocally() {
        Object iAmANullPointingReference = null;

        //Try block signifies the piece of code that the programmer suspects could
        //raise an unexpected situation.
        try{
            System.out.println(iAmANullPointingReference.toString());

        //If any of the piece of code in try block raises an exception
        //Then it is handled in catch block.
        }catch (NullPointerException iAmANullPoiterException){
            //Here we write some alternative code that handles the situation where an exception is raised.
            Arrays.stream(iAmANullPoiterException.getStackTrace())
                  .forEach(System.out::println);
        }


    }
}