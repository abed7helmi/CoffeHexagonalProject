package com.example.coffehexa.application.ports.in;

import com.example.coffehexa.domain.order.Order;

import java.util.UUID;

// préparation du café
public interface PreparingCoffee {
    Order startPreparingOrder(UUID orderId);
    Order finishPreparingOrder(UUID orderId);
}
