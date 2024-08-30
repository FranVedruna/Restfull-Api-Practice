package com.tienda.pruebaTienda.repository;

import com.tienda.pruebaTienda.Entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
