package org.inherit;

import org.inherit.other.Account;
import org.inherit.other.SavingsAccount;

public class TradingAccount extends Account{
    public Integer dematAccountNumber;

    public Integer getDematAccountNumber() {
        return dematAccountNumber;
    }

    public void setDematAccountNumber(Integer dematAccountNumber) {
        this.dematAccountNumber = dematAccountNumber;
    }

    public void transact(){

        //Member of the same class.
        this.dematAccountNumber = 34332;

        //Not accessible here as accountNumber has default access modifier
        //As a result this member is only available within the same package as that
        //of the class.
        //this.accountNumber = 9399393;

        //A protected members.
        this.balance = 598340;

        //Public member from Account class
        this.isNetBankingEnabled = true;

        //this.accountNumber = 1000;

        //Since TradingAccount is outside of the package of Account class
        //Hence none of the members of the Account class are directly visible here.
        Account account = new Account();
//      account.accountNumber = 1999;
//      account.balance = 2234;

        //public members are visible here as well.
        account.isNetBankingEnabled = false;


    }
}