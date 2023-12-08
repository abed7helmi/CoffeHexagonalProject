package com.example.coffehexa.domain.order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {


    private static Stream<Arguments> drinkCosts() {
        return Stream.of(
                arguments(1, Size.SMALL, BigDecimal.valueOf(4.0)),
                arguments(1, Size.LARGE, BigDecimal.valueOf(5.0)),
                arguments(2, Size.SMALL, BigDecimal.valueOf(8.0))
        );
    }

    @ParameterizedTest(name = "{0} drinks of size {1} cost {2}")
    @MethodSource("drinkCosts")
    void orderCostIsBasedOnQuantityAndSize(
            int quantity, Size size, BigDecimal expectedCost) {

        var order = new Order(Location.TAKE_AWAY, List.of(
               // new LineItem(Drink.LATTE, quantity, Milk.WHOLE, size)
                new LineItem(Drink.LATTE, Milk.WHOLE,size, quantity)
        ));

        assertThat(order.getCost()).isEqualTo(expectedCost);
    }

    @Test
    void orderCostIsSumOfLineItemCosts() {
        var order = new Order(Location.TAKE_AWAY, List.of(
                new LineItem(Drink.LATTE, Milk.SKIMMED,Size.LARGE, 1),
                new LineItem(Drink.ESPRESSO, Milk.SOY,Size.SMALL, 1)
        ));
        assertThat(order.getCost()).isEqualTo(BigDecimal.valueOf(9.0));
    }

}