package edu.icet.service.impl;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository customerRepository;
    final ModelMapper modelMapper;

    @Override
    public List<Customer> getAllCustomers() {
        List<CustomerEntity> customerEntities = customerRepository.findAll();
        List<Customer> customers = new ArrayList<>();
        customerEntities.forEach(customerEntity -> {
            customers.add(modelMapper.map(customerEntity, Customer.class));
        });
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(modelMapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(modelMapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(int id) {
        return modelMapper.map(customerRepository.findById(id).get(), Customer.class);
    }

    @Override
    public List<Customer> findByName(String name) {
        List<CustomerEntity> repositoryByName = customerRepository.findByName(name);
        List<Customer> customers = new ArrayList<>();
        repositoryByName.forEach(customerEntity -> {
            customers.add(modelMapper.map(customerEntity, Customer.class));
        });
        return customers;
    }


}
