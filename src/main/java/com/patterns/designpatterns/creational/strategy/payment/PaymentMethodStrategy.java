package com.patterns.designpatterns.creational.strategy.payment;

public interface PaymentMethodStrategy {

  PaymentResult pay(PaymentInfo paymentInfo);

  PaymentType getType();
}
