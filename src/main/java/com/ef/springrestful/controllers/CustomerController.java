package com.ef.springrestful.controllers;

import com.ef.springrestful.domain.Customer;
import com.ef.springrestful.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/api/v1/customers/";

    private final CustomerService customerService; // Add CustomerService, Add Constructor parameter

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    List<Customer> getAllCustomer() {
        return customerService.findAllCustomer();
    }

    //--

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    //--

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    //--

    @PutMapping("/{id}")
    public Customer putCustomer(@PathVariable Long id, @RequestBody Map<String, String> args) {
        return customerService.putCustomer(id, args.get("name"), args.get("username"), args.get("address"), args.get("phone"), args.get("email"), args.get("company"));
    }

    @PatchMapping("/{id}")
    public Customer patchCustomer(@PathVariable Long id, @RequestBody Map<String, String> args2) {
        return customerService.patchCustomer(id, args2.get("name"), args2.get("username"), args2.get("address"), args2.get("phone"), args2.get("email"), args2.get("company"));
    }

    //--

    @DeleteMapping("/{id}")
    public void deleteCustomerById(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
    }

}
