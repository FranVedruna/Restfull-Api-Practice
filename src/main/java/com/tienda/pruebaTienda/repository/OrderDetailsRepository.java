package com.tienda.pruebaTienda.repository;

import com.tienda.pruebaTienda.Entities.OrderDetails;
import com.tienda.pruebaTienda.Entities.OrderDetailsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, OrderDetailsId> {
}
