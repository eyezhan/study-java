/*************************************************************************
	File Name: CheckingAccount.java
	Author: Zhan Lingling
	Mail: zhan_lingling@sina.cn
	Created Time: Wed Sep  5 17:25:36 2018
 ************************************************************************/

import java.io.*;

public class CheckingAccount {
    private double balance;
    private int number;
    public CheckingAccount (int number) {
        this.number = number;
    }
    public void deposit (double amount) {
        balance += amount;
    }
    public void withdraw (double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBalance() {
        return balance;
    }
    public int getNumber() {
        return number;
    }
}
