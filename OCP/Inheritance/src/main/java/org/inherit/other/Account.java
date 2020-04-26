package org.inherit.other;

public class Account {
    long accountNumber;
    protected Integer balance;
    public Boolean isNetBankingEnabled;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}