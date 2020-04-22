package org.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchFinally implements Feature{

    @Override
    public void display() throws Exception {
        //tryCatch();
        tryCatchWithFinally();
    }

    //-------------Below are two ways of handling exceptions---------------------//
    //--------------1. Using the try-catch block--------------------------------//
    //--------------2. Other is throws clause-----------------------------------//

    //This shows try-catch functionality with Checked exceptions.
    private void tryCatchCheckedException(){
        //FileNotFoundException is raised when a file which the programmer tried to access
        //did not exist on the location he specified.
        //This is an exception hwich the compilr forces to handle in a try catch block.
        //If we don't handle it compiler gives an error.
        try {
            //This raises a file not found exception.
            //Here is it handled using the try-catch block.
            FileInputStream fis = new FileInputStream("An Invalid Location");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //This shows that a piece of code can choose to delegate the Checked exception
    //to the calling code using the throws clause.
    private void throwingCheckedException() throws FileNotFoundException{
        //FileNotFoundException is raised when a file which the programmer tried to access
        //did not exist on the location he specified.
        //This is an exception which the compile forces to handle in a try catch block
        //Or by allowing the caller of the method to handle the exception using the throws clause.
        //If we don't handle it compiler gives an error.

        //This raises a file not found exception.
        //Here is it handled using the try-catch block.
        FileInputStream fis = new FileInputStream("An Invalid Location");
    }


    //--------------------------Case of Unchecked Exceptions----------------------//

    //This shows the unchecked exception functionality.
    private void tryCatchUnchecked(){
        Integer i1 = null, i2 = null;

        //The valueOf(String) method takes a number in String format and converts that to an Integer.
        //Here it takes numb er 40 as a String and converts it to 40 as an Integer.
        i1 = Integer.valueOf("40");

        //Here also a number as a String is expected but instead a String Java was passed
        //which is not the right format as expected by this method.
        //Hence it throws a NumberFormatException.
        //Since it is an unchecked exception, hence compiler does not ask for
        //handling this.
        i2 = Integer.valueOf("Java");
        int additionResult = i1 + i2;
    }


    //------------------------Case of try-catch-finally-----------------//

    //This shows the try-catch-finally functionality.
    private void tryCatchWithFinally(){

        //Some file that is beoing used in this method.
        FileInputStream fis = null;
        try {
            //We open a connection to the ddatabase.
            //And some issue occurred with the database connection
            //Lets say database server was down.
            //This would raise a checked SQLException.
            Connection connection = DriverManager.getConnection("");
            connection.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //Since Finally block is a piece of code that is guaranteed to be
            //executed, hence here we execute that code which cleans up the current execution
            //In this example, since we had also opened up a file connection but due to database
            //exception our functionality could not be completed and an exception was thrown.
            //We successfully handled the database exception in the catch block but the
            //File connection that we had opened is still open and which could cause a connection
            //leak or inconsistent state in the file.Hence we close the open file connection
            //here in the finally block.

            //Consider also the case where the code in finally block could also have raised
            //an Unchecked exception like the NullPointerException in which case the catch block
            //would not have been executed at all.In this case if there would not have been any finally block
            //then closing the connection to the file would not have been possible and which would have
            //lead to connection leak.
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}