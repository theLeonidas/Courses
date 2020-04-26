package org.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Others extends SuperClass implements Feature{

    //A static initializer block.
    static {
        //Cannot throw any exceptions here.
        //throw new IllegalArgumentException("");

        //Any checked exception has to be handled locally here itself.
        try {
            throw new FileNotFoundException("File was not found.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //An instance initializer block.
    {
        if(1==1)
            throw new IOException();
    }

    //Since instance initializer throws a checked exception hence
    //All constructors are required to declare it in their throws clause.
    public Others()throws IOException{

    }

    //Also since the super class defines an IOException
    //Hence subclass must declare an exception of same or higher class.
    public Others(Integer intValue)throws IOException{

    }

    @Override
    public void display() throws Exception {

    }

    //Incorrect way of handling ertions.
    private void incoorectWyOFExcepionHandling(){
        try{
            FileInputStream fis = new FileInputStream("iNCORRECT PATH");
        }catch (Exception exc){
            //Its ideally not correct to do stuff here.
        }
    }

    private void multipleCatchBlock() {

        //Correct usage of multiple catch blocks.
        try {
            throw new NullPointerException();
        } catch (NullPointerException nullEx) {
            System.out.println("A null pointer exception was raised.");
        } catch (Exception exc) {
            System.out.println("Handled the exception inside Excepion bloxk.");
        } catch (Throwable exc) {
            System.out.println("Handled the exception inside Throwable bloxk.");
        }

        //InCorrect usage of multiple catch blocks.
        try {
            throw new NullPointerException();

            //All exceptions are handled in this block itself and the control never goes in the below mentuoned
            //Catch blocks
        } catch (Throwable exc) {
            System.out.println("Handled the exception inside Throwable bloxk.");
//        }catch (NullPointerException nullEx){
//            System.out.println("A null pointer exception was raised.");
//        }catch (Exception exc){
//            System.out.println("Handled the exception inside Excepion bloxk.");
//        }
        }
    }

    private void nestedExceptions() {}
}