package org.academiadecodigo.javabank.service;

import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.javabank.controller.LoginController;
import org.academiadecodigo.javabank.model.Bank;
import org.academiadecodigo.javabank.model.Customer;
import org.academiadecodigo.javabank.view.Messages;

public class AuthS implements AuthService{


    private Bank bank;
    private LoginController loginController;





    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    @Override
    public boolean authenticate(Integer id) {

        if (bank.getCustomerIds().contains(id)) {
            bank.setLoginCustomer(id);
            return true;
        } else if (!bank.getCustomerIds().contains(id)) {

            return false;
        }
        return false;
    }

    @Override
    public Customer getAccessingCustomer() {
        return null;
    }




}
