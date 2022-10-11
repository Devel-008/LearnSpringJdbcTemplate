package com.practice.transaction.Programmatic;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImpl implements BankDao {
    private JdbcTemplate jdbcTemplate;
    String query;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void withdraw(Account fromAccount, Account toAccount, Double amount) throws InsufficientBalanceException {
        Account accountForDb = getAccountFromDb(fromAccount.getAccountNo());
        Double accountBalance = accountForDb.getAccountBalance() - amount;
        if (accountForDb.getAccountBalance() >= amount) {
            query = "update bankAccount set accountBalance = ? where accountNo = ?";
            int update = getJdbcTemplate().update(query, accountBalance, fromAccount.getAccountNo());
            if (update > 0) {
                System.out.println("Amount Rs:=" + amount + " is transferred from Account No: " + fromAccount.getAccountNo() + " to Account No: " + toAccount.getAccountNo());
            }
        } else {
            throw new InsufficientBalanceException("Insufficient Balance in Account!!");
        }
    }

    @Override
    public void depoist(Account fromAccount, Account toAccount, Double amount) {
        Account accountForDb = getAccountFromDb(toAccount.getAccountNo());
        Double accountBalance = accountForDb.getAccountBalance() + amount;
        query = "update bankAccount set accountBalance = ? where accountNo = ?";
        int update = getJdbcTemplate().update(query, accountBalance, toAccount.getAccountNo());
        if (update > 0) {
            System.out.println("Amount Rs:=" + amount + " is deposited in Account No: " + toAccount.getAccountNo());
        }
       // throw new RuntimeException();
    }

    private Account getAccountFromDb(long accountNo) {
        query = "select * from bankAccount where accountNo = ? ";
        Account account = getJdbcTemplate().queryForObject(query, new AccountRowMapper(), accountNo);
        return account;
    }
}
