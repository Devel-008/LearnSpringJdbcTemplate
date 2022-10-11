package com.practice.transaction.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) throws InsufficientBalanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BankService service = context.getBean("bankServiceImpl",BankServiceImpl.class);
       Account fromAccount = new Account();
       fromAccount.setAccountNo(1);
       Account toAccount = new Account();
       toAccount.setAccountNo(2);
        service.transferFund(fromAccount, toAccount, 1000.0);
    }
}
