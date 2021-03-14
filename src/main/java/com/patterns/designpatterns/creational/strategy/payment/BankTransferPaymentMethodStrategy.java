package com.patterns.designpatterns.creational.strategy.payment;

import java.math.BigDecimal;
import org.springframework.stereotype.Component;

@Component
public class BankTransferPaymentStrategy implements PaymentStrategy {
  @Override
  public PaymentResult pay(PaymentInfo paymentInfo) {
    System.out.println("Paying by bank transfer");

    // call do innego serwisu
    if(paymentInfo.getPrice().compareTo(BigDecimal.valueOf(10)) < 0) {
      System.out.println("Payment by bank transfer failed");
      return PaymentResult.FAILURE;
    }
    System.out.println("Payment by bank transfer succeded");
    return PaymentResult.SUCCESS;
  }

  @Override
  public PaymentType getType() {
    return PaymentType.BANK_TRANSFER;
  }
}
