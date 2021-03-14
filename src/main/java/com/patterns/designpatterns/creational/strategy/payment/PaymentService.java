package com.patterns.designpatterns.creational.strategy.payment;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

  private final PaymentMethodFactory paymentMethodFactory;

  public PaymentService(PaymentMethodFactory paymentMethodFactory) {
    this.paymentMethodFactory = paymentMethodFactory;
  }

  public PaymentResult pay(PaymentInfo paymentInfo) {
    PaymentMethodStrategy paymentMethod = paymentMethodFactory.getPaymentMethod(paymentInfo.getPaymentType());
    return paymentMethod.pay(paymentInfo);

  }
}
