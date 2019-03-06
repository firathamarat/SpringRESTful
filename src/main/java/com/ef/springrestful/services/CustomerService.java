package com.ef.springrestful.services;

import com.ef.springrestful.domain.Customer;

import java.util.List;

public interface CustomerService { // Alt + Enter: Create Implement interface

    List<Customer> findAllCustomer();

    Customer findCustomerById(Long id);

    Customer saveCustomer(Customer customer);

    void deleteCustomerById(Long id);

    Customer putCustomer(Long id, String name, String username, String address, String phone, String email, String company);

    Customer patchCustomer(Long id, String name, String username, String address, String phone, String email, String company);
    
}
