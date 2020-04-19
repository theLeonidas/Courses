package org.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InBuiltExceptions implements Feature{

    @Override
    public void display() throws Exception {

        //This method throws an exception object of NullPointerException class.
        showNullPointerException();

        //This method throws an exception object of ArrayIndexOutOfBoundException class.
        showArrayIndexOutOfBoundException();

        //This method throws an exception object of ClassNotFoundException class.
        showClassNotFoundException();

        //This method throws an exception object of FileNotFoundException class.
        showFileNotFoundException();
    }

    private void showNullPointerException(){
        //A null referring object.
        Object aNullReferencingObject = null;

        //Calling a method on a reference which points to null
        //raises an exception because there is no underlying object.
        aNullReferencingObject.hashCode();
    }

    private void showArrayIndexOutOfBoundException(){
        //This exception is raised in case where we try to access an index
        //which does not exist (negative indexes) or is out of range.
        Integer [] intArray = new Integer[20];
        intArray[50] = 500;
    }

    private void showClassNotFoundException(){
        //This exception is raised when we try to load a class at runtime
        //but that class does not exist in the classpath.
        try {
            Class.forName("org.class.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void showFileNotFoundException(){
        //This exception is raised when we try to load a file at runtime
        //but that file does not exist in the location specified.
        try {
            FileInputStream fileInputStream = new FileInputStream("Path to a file which does not exist.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}