package com.example.coffehexa.domain.order;

import java.math.BigDecimal;
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

    public Order markBeingPrepared() {
        if (status != Status.READY) {
            throw new IllegalStateException("Order is already paid");
        }
        status = Status.PREPARING;
        return this;
    }

    public BigDecimal getCost() {
        return items.stream()
                .map(LineItem::getCost)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

    public UUID getId() {
        return id;
    }
}
