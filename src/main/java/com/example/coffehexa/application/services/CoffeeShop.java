package com.example.coffehexa.application.services;

import com.example.coffehexa.application.ports.in.OrderingCoffee;
import com.example.coffehexa.application.ports.out.Orders;
import com.example.coffehexa.application.ports.out.Payments;
import com.example.coffehexa.domain.payment.CreditCard;
import com.example.coffehexa.domain.order.Order;
import com.example.coffehexa.domain.payment.Payment;
import com.example.coffehexa.domain.payment.Receipt;

import java.time.LocalDate;
import java.util.UUID;

//Le rôle de la CoffeeShopclasse est d'orchestrer les opérations sur les entités et les référentiels.
// Il met en œuvre les ports primaires comme cas d'utilisation et utilise les ports secondaires comme référentiels.
public class CoffeeShop implements OrderingCoffee {
    private final Orders orders;
    private final Payments payments;

    public CoffeeShop(Orders orders, Payments payments) {
        this.orders = orders;
        this.payments = payments;
    }

    // ...

    @Override
    public Order placeOrder(Order order) {
        return null;
    }

    @Override
    public Order updateOrder(UUID orderId, Order order) {
        return null;
    }

    @Override
    public void cancelOrder(UUID orderId) {

    }

    @Override
    public Payment payOrder(UUID orderId, CreditCard creditCard) throws Exception {
        var order = orders.findOrderById(orderId);

        orders.save(order.markPaid());

        return payments.save(new Payment(orderId, creditCard, LocalDate.now()));
    }

    @Override
    public Receipt readReceipt(UUID orderId) {
        return null;
    }

    @Override
    public Order takeOrder(UUID orderId) {
        return null;
    }

}

