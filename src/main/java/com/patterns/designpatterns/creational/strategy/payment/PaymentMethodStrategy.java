package com.patterns.designpatterns.creational.strategy.payment;

public interface PaymentStrategy {

  PaymentResult pay(PaymentInfo paymentInfo);

  PaymentType getType();
}
