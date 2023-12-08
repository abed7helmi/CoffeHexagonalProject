package com.example.coffehexa.domain.order;

public record LineItem(Drink drink, Milk milk, Size size, int quantity) { }
