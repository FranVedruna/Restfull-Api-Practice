package com.tienda.pruebaTienda.service;

import com.tienda.pruebaTienda.Entities.Customer;
import com.tienda.pruebaTienda.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomer(){
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    public Customer getCustomerById(Long id){
        Customer customer = customerRepository.findById(id).orElse(null);
        return customer;
    }

    public Customer saveCustomer(Customer customer){
        Customer customerSaved = customerRepository.save(customer);
        return customerSaved;
    }

    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Long id, Customer customer){
        Customer customerUpdated = customerRepository.findById(id).orElse(null);
        if(customerUpdated == null){
            return null;
        }

        customerUpdated.setCustomer_id(customer.getCustomer_id());
        customerUpdated.setOrders(customer.getOrders());
        customerUpdated.setBirthDate(customer.getBirthDate());
        customerUpdated.setFirstName(customer.getFirstName());
        customerUpdated.setLastName(customer.getLastName());
        customerUpdated.setRegistrationDate(customer.getRegistrationDate());

        customerUpdated = customerRepository.save(customerUpdated);
        return customerUpdated;
    }

}
