package com.practice.transaction.simple;

public class BankServiceImpl implements BankService{

    private BankDao bankDao;

    public BankDao getBankDao() {
        return bankDao;
    }

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }

    @Override
    public void transferFund(Account fromAccount, Account toAccount, Double amount) throws InsufficientBalanceException {
         getBankDao().withdraw(fromAccount, toAccount, amount);
         getBankDao().depoist(fromAccount, toAccount, amount);
    }
}
