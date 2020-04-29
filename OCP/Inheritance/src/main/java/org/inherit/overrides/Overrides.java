package org.inherit.overrides;

import org.inherit.Feature;

public class Overrides implements Feature{

    @Override
    public void display() throws Exception {
        //An apple iphone.
        Mobile appleIphone = new Mobile("I am learning Java !!");

        //If I intend to send an SMS.
        MessageSender sendSMS = new MessageSender();

        //If I intend to send an Email.
        EmailSender sendMail = new EmailSender();

        //This sends an SMS.
        Number number = appleIphone.sendMessage(sendSMS);

        //This sends an email message.
        appleIphone.setMessage("I am new to Java.");
        //Number number = appleIphone.sendMessage(sendMail);

        //If
        switch (number.intValue()){
            case 1: System.out.println("Message was sent successfully.");
                    break;

            default: System.out.println("Message could not be sent.");
                     break;
        }
    }
}