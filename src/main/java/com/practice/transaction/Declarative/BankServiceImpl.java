package com.practice.transaction.Declarative;

public class BankServiceImpl implements BankService {

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

      /*  transactionTemplate.execute(new TransactionCallback<Void>() {
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
        });*/
    }
}
