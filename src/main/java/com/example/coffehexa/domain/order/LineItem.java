package com.example.coffehexa.domain.order;

import java.math.BigDecimal;

public record LineItem(Drink drink, Milk milk, Size size, int quantity) {
    BigDecimal getCost() {
        var price = BigDecimal.valueOf(4.0);
        if (size == Size.LARGE) {
            price = price.add(BigDecimal.ONE);
        }
        return price.multiply(BigDecimal.valueOf(quantity));
    }
}
