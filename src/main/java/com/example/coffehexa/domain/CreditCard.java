package com.example.coffehexa.domain;

public record CreditCard(
        String cardHolderName,
        String cardNumber,
        Month expiryMonth,
        Year expiryYear) { }
