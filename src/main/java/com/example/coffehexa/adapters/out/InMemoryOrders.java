package com.example.coffehexa.adapters.out;

import com.example.coffehexa.application.ports.out.Orders;
import com.example.coffehexa.domain.order.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMemoryOrders implements Orders {
    private final Map<UUID, Order> entities = new HashMap<>();

    @Override
    public Order findOrderById(UUID orderId) throws Exception {
        var order = entities.get(orderId);
        if (order == null) {
            throw new Exception();
        }
        return order;
    }

    @Override
    public Order save(Order order) {
        entities.put(order.getId(), order);
        return order;
    }

    @Override
    public void deleteById(UUID orderId) {
        entities.remove(orderId);
    }
}

