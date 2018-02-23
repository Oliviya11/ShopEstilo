package com.services;

import com.users.Customer;

public interface CustomerServiceInterface {

    void addCustomer(Customer customer);
    void updateCustomer(long id, Customer customer);
    Customer getCustomerByLogin(String login);

}
