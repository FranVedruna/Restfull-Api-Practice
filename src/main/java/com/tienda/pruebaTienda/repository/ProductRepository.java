package com.tienda.pruebaTienda.repository;

import com.tienda.pruebaTienda.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
