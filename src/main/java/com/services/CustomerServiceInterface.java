package com.services;

import com.users.Customer;

public interface CustomerServiceInterface {

    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    Customer getCustomerByLogin(String login);

}
