package org.academiadecodigo.javabank.service;

import org.academiadecodigo.javabank.managers.AccountManager;
import org.academiadecodigo.javabank.model.Bank;
import org.academiadecodigo.javabank.model.Customer;
import org.academiadecodigo.javabank.model.account.Account;

public class AccountS implements AccountService{


    private Bank bank;








    public void setBank(Bank bank) {
        this.bank = bank;
    }



    @Override
    public void add(Account account) {
        bank.getLoginCustomer().addAccount(account);
    }

    @Override
    public void deposit(int id, double amount) {

    }

    @Override
    public void withdraw(int id, double amount) {

    }

    @Override
    public void transfer(int srcId, int dstId, double amount) {

    }
}
