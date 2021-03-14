package com.patterns.designpatterns.creational.strategy.payment;

import java.math.BigDecimal;
import org.springframework.stereotype.Component;

@Component
public class PaypalPaymentMethodStrategy implements PaymentMethodStrategy {
  @Override
  public PaymentResult pay(PaymentInfo paymentInfo) {
    System.out.println("Paying by paypalMethod");

    // call do innego serwisu
    if(paymentInfo.getPrice().compareTo(BigDecimal.valueOf(10)) < 0) {
      System.out.println("Payment for paypal failed");
      return PaymentResult.FAILURE;
    }
    System.out.println("Payment for paypal succeded");
    return PaymentResult.SUCCESS;
  }

  @Override
  public PaymentType getType() {
    return PaymentType.PAYPAL;
  }
}
