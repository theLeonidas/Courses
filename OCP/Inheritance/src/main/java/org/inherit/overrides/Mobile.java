package org.inherit.overrides;

import java.io.IOException;

public class Mobile {
    private String message;

    Mobile(String message){
        this.message = message;
    }

    //sendMessage method takes in a generic Message sender
    //and transparently without knowing the underlying implementation
    //of Message sender sends  message.
    public Number sendMessage(MessageSender sender){
        Number numb = null;
        try {
            //At runtime depending upon the exact type of object and
            //and exact type of method implementation send method is invoked.
            numb = sender.send(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numb;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}