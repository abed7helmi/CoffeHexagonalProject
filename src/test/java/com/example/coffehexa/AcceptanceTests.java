package com.example.coffehexa;

import com.example.coffehexa.adapters.out.InMemoryOrders;
import com.example.coffehexa.application.ports.in.OrderingCoffee;
import com.example.coffehexa.application.ports.in.PreparingCoffee;
import com.example.coffehexa.application.ports.out.Orders;
import com.example.coffehexa.application.ports.out.Payments;
import com.example.coffehexa.application.services.CoffeeMachine;
import com.example.coffehexa.application.services.CoffeeShop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

/*class AcceptanceTests {
    private Orders orders;
    private Payments payments;
    private OrderingCoffee customer;
    private PreparingCoffee barista;

    @BeforeEach
    void setup() {
        orders = new InMemoryOrders();
        payments = new InMemoryPayments();
        customer = new CoffeeShop(orders, payments);
        barista = new CoffeeMachine(orders);
    }

    // ...

    @Test
    void customerCanPayTheOrder() {
        var existingOrder = orders.save(anOrder());
        var creditCard = aCreditCard();

        var payment = customer.payOrder(existingOrder.getId(), creditCard);

        assertThat(payment.getOrderId()).isEqualTo(existingOrder.getId());
        assertThat(payment.getCreditCard()).isEqualTo(creditCard);
    }

    @Test
    void baristaCanStartPreparingTheOrderWhenItIsPaid() {
        var existingOrder = orders.save(aPaidOrder());

        var orderInPreparation = barista.startPreparingOrder(existingOrder.getId());

        assertThat(orderInPreparation.getStatus()).isEqualTo(Status.PREPARING);
    }

    // ...
}*/

