package com.practice.transaction.Programmatic;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String s) {
        super(s);
    }
}
