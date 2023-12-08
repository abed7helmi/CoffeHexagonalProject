package com.example.coffehexa.application.ports.in;

import com.example.coffehexa.domain.payment.CreditCard;
import com.example.coffehexa.domain.order.Order;
import com.example.coffehexa.domain.payment.Payment;
import com.example.coffehexa.domain.payment.Receipt;

import java.util.UUID;

// préparation d'une commande
public interface OrderingCoffee {
    Order placeOrder(Order order);
    Order updateOrder(UUID orderId, Order order);
    void cancelOrder(UUID orderId);
    Payment payOrder(UUID orderId, CreditCard creditCard) throws Exception;
    Receipt readReceipt(UUID orderId);
    Order takeOrder(UUID orderId);
}
