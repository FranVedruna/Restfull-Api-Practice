package com.tienda.pruebaTienda.repository;

import com.tienda.pruebaTienda.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
