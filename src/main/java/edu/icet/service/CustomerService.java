package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;

public interface CustomerService {
    
    List<Customer> getAllCustomers();

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(int id);

    Customer findById(int id);

    List<Customer> findByName(String name);
}
