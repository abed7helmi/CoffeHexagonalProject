package com.example.coffehexa.domain.order;

import java.util.List;
import java.util.UUID;

import com.example.coffehexa.domain.order.LineItem;

public class Order {
    private UUID id = UUID.randomUUID();
    private final Location location;

    private final List<LineItem> items;
    private Status status = Status.PAYMENT_EXPECTED;

    public Order(Location location, List<LineItem> items) {
        this.location = location;
        this.items = items;
    }

    // ...

    public Order markPaid() {
        if (status != Status.PAYMENT_EXPECTED) {
            throw new IllegalStateException("Order is already paid");
        }
        status = Status.PAID;
        return this;
    }

}
