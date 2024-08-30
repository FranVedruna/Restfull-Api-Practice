package com.tienda.pruebaTienda.Entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrderDetailsId implements Serializable {
    private Long orderId;
    private Long productId;

    // Constructor, equals, and hashCode methods

    public OrderDetailsId() {}

    public OrderDetailsId(Long orderId, Long productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    // Getters, setters, equals, and hashCode methods
}