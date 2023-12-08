package com.example.coffehexa.domain;

public record Payment(UUID orderId, CreditCard creditCard, LocalDate paid) { }
