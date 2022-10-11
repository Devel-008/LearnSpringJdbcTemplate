package com.practice.transaction.Programmatic;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setAccountNo(rs.getInt("accountNo"));
        account.setAccountBalance(rs.getDouble("accountBalance"));
        account.setAccountHolder(rs.getString("accountHolder"));
        account.setAccountType(rs.getString("accountType"));
        return account;
    }
}
