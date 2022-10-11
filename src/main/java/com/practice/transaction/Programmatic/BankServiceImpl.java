package com.practice.transaction.Programmatic;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class BankServiceImpl implements BankService {

    private BankDao bankDao;
    private TransactionTemplate transactionTemplate;

    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public BankDao getBankDao() {
        return bankDao;
    }

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }

    @Override
    public void transferFund(Account fromAccount, Account toAccount, Double amount) {
        transactionTemplate.execute(new TransactionCallback<Void>() {
            @Override
            public Void doInTransaction(TransactionStatus status) {
                try {
                    getBankDao().withdraw(fromAccount, toAccount, amount);
                    getBankDao().depoist(fromAccount, toAccount, amount);
                } catch (InsufficientBalanceException e) {
                    System.out.println(e+"");
                }
                return null;
            }
        });

    }
}
