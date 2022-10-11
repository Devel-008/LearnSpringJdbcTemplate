package com.practice.transaction.Declarative;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String s) {
        super(s);
    }
}
