package com.practice.transaction.simple;

public interface BankDao {
    public abstract void withdraw(Account fromAccount, Account toAccount, Double amount) throws InsufficientBalanceException;
    public abstract void depoist
            (Account fromAccount, Account toAccount, Double amount);
}
