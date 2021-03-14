package com.patterns.designpatterns.creational.strategy.payment;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PaymentMethodFactory {

  private final List<PaymentMethodStrategy> paymentStrategies;

  public PaymentMethodFactory(List<PaymentMethodStrategy> paymentStrategies) {
    this.paymentStrategies = paymentStrategies;
  }

  public PaymentMethodStrategy getPaymentMethod(PaymentType type) {
    return paymentStrategies.stream()
            .filter(it -> it.getType() == type)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("PaymentType is not supported"));
  }
}
