package org.academiadecodigo.javabank.service;

import org.academiadecodigo.javabank.model.Customer;

import java.util.List;
import java.util.Set;

public class CustomS implements CustomerService{



    @Override
    public Customer get(Integer id) {
        return null;
    }

    @Override
    public List<Customer> list() {
        return null;
    }

    @Override
    public Set<Integer> listCustomerAccountIds(Integer id) {
        return null;
    }

    @Override
    public double getBalance(int customerId) {
        return 0;
    }

    @Override
    public void add(Customer customer) {

    }
}
