package org.inherit.overrides;

import java.io.IOException;

public class MessageSender {

    //Sends an SMS.
    //Original definition of the send() method.
    Number send(String message)throws IOException{
        System.out.println("About to send an SMS.");
        if(message.contains("Java"))
            return 1;
        else return -1;
    }
}