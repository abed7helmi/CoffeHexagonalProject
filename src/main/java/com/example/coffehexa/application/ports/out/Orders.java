package com.example.coffehexa.application.ports.out;

public interface Orders {
    Order findOrderById(UUID orderId) throws OrderNotFound;
    Order save(Order order);
    void deleteById(UUID orderId);
}
