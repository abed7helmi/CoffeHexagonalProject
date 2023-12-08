package com.example.coffehexa.domain;

public class Order {
    private UUID id = UUID.randomUUID();
    private final Location location;
    private final List<LineItem> items;
    private Status status = Status.PAYMENT_EXPECTED;

    // ...
}
