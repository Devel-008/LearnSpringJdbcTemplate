package com.practice.transaction.Programmatic;

public interface BankService {
    public abstract void transferFund(Account fromAccount, Account toAccount, Double amount) throws InsufficientBalanceException;
}
