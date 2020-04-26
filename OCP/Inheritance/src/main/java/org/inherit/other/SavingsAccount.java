package org.inherit.other;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SavingsAccount extends Account {
    public Integer withdrawlLimit;
    private boolean isCreditCardNeeded;

    public SavingsAccount(Boolean isCreditCardNeeded) {
        this.isCreditCardNeeded = isCreditCardNeeded;
    }

    public SavingsAccount(){
        System.out.println("Called");
    }

    public void transact(){

        //A private member is only accessible within the class
        //and is not accessible out side of the class.
        this.isCreditCardNeeded = false;

        //Public members are available, any & everywhere.
        this.withdrawlLimit = 50;

        //Since accountNumber is default & balance is protected
        //As a result both these members are available within the inheriting SavingsAccount class.
        this.accountNumber = 345;
        this.balance =  100;

        //Since accountNumber is default & balance is protected
        //As a result both these members are available within the inheriting SavingsAccount class.
        this.accountNumber = 345;
        this.balance =  100;

        //This is public member from Account class
        //Hence this is visible from anywhere.
        this.isNetBankingEnabled = true;

        //Since SavingsAccount is defined in the same package as Account
        //Hence both accountNumber & balance are also directly visible.
        Account account = new Account();
        account.accountNumber = 1999;
        account.balance = 2234;

        //This is public member from Account class
        //Hence this is visible from anywhere.
        account.isNetBankingEnabled = false;
    }
}