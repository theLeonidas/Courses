package org.inherit;

import org.inherit.other.Account;
import org.inherit.other.SavingsAccount;

public class AccessModifiers implements Feature{

    @Override
    public void display() throws Exception {
        TradingAccount tradingAcct = new TradingAccount();
        tradingAcct.transact();

        SavingsAccount savingAcct = new SavingsAccount(true);
        savingAcct.transact();
    }
}