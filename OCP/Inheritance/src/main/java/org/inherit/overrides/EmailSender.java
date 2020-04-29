package org.inherit.overrides;

import java.io.EOFException;
import java.nio.charset.CharacterCodingException;

public class EmailSender extends MessageSender{


    //---------------------Method Overriding------------------------------//

    //Access Modifier
        //Original : default (Nothing specified)
        //Overriding : protected
        //Explanation : protected access is wider as compared to default

    //Return type
        //Original : Number
        //Overriding : Integer
        //Explanation : Integer is a subclass of Number class.

    //Method Name
        //Original : send
        //Overriding : send
        //Explanation : remains same.

    //Input Parameters
        //Original : String
        //Overriding : String
        //Explanation : Number, type & order remains same.

    //throws clause
        //Original : IOException
        //Overriding : 0 or more.
        //Explanation :  All checked exceptions in the throws clause which are in the hierarchy of IOException are fine.
        //               but those that are not in the hierarchy of IOException are flagged as compile error.
        //               Raising an unchecked exception does not change the situation in any ways.

    @Override
    protected Integer send(String message){//throws EOFException, CharacterCodingException, NullPointerException, CloneNotSupportedException {
        System.out.println("About to send an email.");
        if(message.contains("Java"))
            return 1;
        else return -1;
    }

    //------------------------------Incorrect ways of Overriding------------------//
}