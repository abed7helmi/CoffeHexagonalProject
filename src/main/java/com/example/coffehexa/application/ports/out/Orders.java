package com.example.coffehexa.application.ports.out;

import com.example.coffehexa.domain.order.Order;

import java.util.UUID;

public interface Orders {
    //Order findOrderById(UUID orderId) throws OrderNotFound;
    Order findOrderById(UUID orderId) throws Exception;
    Order save(Order order);
    void deleteById(UUID orderId);
}
