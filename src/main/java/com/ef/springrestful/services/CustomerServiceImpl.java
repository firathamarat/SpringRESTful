package com.ef.springrestful.services;

import com.ef.springrestful.domain.Customer;
import com.ef.springrestful.repositories.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service // Service dosyası olduğu annotation ile belirtildi
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository; //Alt + Enter: Add Constructor parameter

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    //--

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    //--

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    //--

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer putCustomer(Long id, String name, String username, String address, String phone, String email, String company) {
        Customer customer = findCustomerById(id);
        customer.setName(name);
        customer.setUsername(username);
        customer.setAddress(address);
        customer.setPhone(phone);
        customer.setEmail(email);
        customer.setCompany(company);
        customerRepository.save(customer);

        return null;
    }

    //--

    @Override
    public Customer patchCustomer(Long id, String name, String username, String address, String phone, String email, String company) {

        Customer customer = findCustomerById(id);

        if (name != null) {
            customer.setName(name);
        }
        if (username != null) {
            customer.setUsername(username);
        }
        if (address != null) {
            customer.setAddress(address);
        }
        if (phone != null) {
            customer.setPhone(phone);
        }
        if (email != null) {
            customer.setEmail(email);
        }
        if (company != null) {
            customer.setCompany(company);
        }

        return customerRepository.save(customer);
    }


}
