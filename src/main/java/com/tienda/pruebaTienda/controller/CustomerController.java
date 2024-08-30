package com.tienda.pruebaTienda.controller;

import com.tienda.pruebaTienda.Entities.Customer;
import com.tienda.pruebaTienda.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
     @Autowired
    private CustomerService customerService;

     @GetMapping
    public List<Customer> getAllCustomer(){
         return customerService.getAllCustomer();
     }

    @GetMapping("/{id}")
    public Customer getCustomerByID(@PathVariable long id){
         return customerService.getCustomerById(id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
         return customerService.saveCustomer(customer);
    }

    @PutMapping
    public ResponseEntity<Customer> updateCustomer(@PathVariable long id, @RequestBody Customer customer){
        Optional<Customer> optionalCustomer = Optional.ofNullable(customerService.getCustomerById(id));
        if (optionalCustomer.isPresent()){
            customer.setCustomer_id(id);
            Customer updatedCustomer = customerService.saveCustomer(customer);
            return ResponseEntity.ok(updatedCustomer);
        }else {
            return null;
        }
    }

}
