package com.empik.cms.dynamic.configuration.service.adapter.api.payment;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentMethodFactory {

  private final List<PaymentStrategy> paymentStrategies;

  public PaymentMethodFactory(List<PaymentStrategy> paymentStrategies) {
    this.paymentStrategies = paymentStrategies;
  }

  public PaymentStrategy getPaymentMethod(PaymentType type) {
    return paymentStrategies.stream()
            .filter(it -> it.getType() == type)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("PaymntType is not supported"));
  }
}
