package com.practice.transaction.Declarative;

public interface BankService {
    public abstract void transferFund(Account fromAccount, Account toAccount, Double amount) throws InsufficientBalanceException;
}
