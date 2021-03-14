package com.patterns.designpatterns.creational.strategy.payment;

import java.math.BigDecimal;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentStrategy implements PaymentStrategy {
  @Override
  public PaymentResult pay(PaymentInfo paymentInfo) {
    System.out.println("Paying by credit card");

    // call do innego serwisu
    if (paymentInfo.getPrice().compareTo(BigDecimal.valueOf(10)) < 0) {
      System.out.println("Payment by bcredit card failed");
      return PaymentResult.FAILURE;
    }
    System.out.println("Payment by credit card succeded");
    return PaymentResult.SUCCESS;
  }

  @Override
  public PaymentType getType() {
    return PaymentType.CREDIT_CARD;
  }
}
