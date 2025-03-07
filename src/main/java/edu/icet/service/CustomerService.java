package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;

public interface CustomerService {
    
    List<Customer> getAllCustomers();

    Boolean addCustomer(Customer customer);

    Boolean updateCustomer(Customer customer);

    Boolean deleteCustomer(int id);

    Customer findById(int id);

    List<Customer> findByName(String name);
}
