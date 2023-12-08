package com.example.coffehexa.application.ports.out;

import com.example.coffehexa.domain.payment.Payment;

import java.util.UUID;

public interface Payments {
    Payment findPaymentByOrderId(UUID orderId);
    Payment save(Payment payment);
}
