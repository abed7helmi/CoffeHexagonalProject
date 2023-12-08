package com.example.coffehexa.application.services;

import com.example.coffehexa.application.ports.in.PreparingCoffee;
import com.example.coffehexa.application.ports.out.Orders;
import com.example.coffehexa.domain.order.Order;

import java.util.UUID;

public class CoffeeMachine implements PreparingCoffee {
    private final Orders orders;

    public CoffeeMachine(Orders orders) {
        this.orders = orders;
    }

    @Override
    public Order startPreparingOrder(UUID orderId) throws Exception {
        var order = orders.findOrderById(orderId);

        return orders.save(order.markBeingPrepared());
    }

    @Override
    public Order finishPreparingOrder(UUID orderId) {
        return null;
    }

    // ...
}
