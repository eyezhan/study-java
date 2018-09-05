/*************************************************************************
	File Name: InsufficientFundsException.java
	Author: Zhan Lingling
	Mail: zhan_lingling@sina.cn
	Created Time: Wed Sep  5 16:47:28 2018
 ************************************************************************/

import java.io.*;

public class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException (double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}
