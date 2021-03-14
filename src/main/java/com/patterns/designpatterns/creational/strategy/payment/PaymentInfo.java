package com.patterns.designpatterns.creational.strategy.payment;

import com.google.common.base.Preconditions;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class PaymentInfo {

  private final List<String> productIds;
  private final PaymentType paymentType;
  private final BigDecimal price;

  public PaymentInfo(List<String> productIds, PaymentType paymentType, BigDecimal price) {
    Preconditions.checkArgument(!Objects.isNull(price), "Price cannot be null");
    this.productIds = productIds;
    this.paymentType = paymentType;
    this.price = price;
  }

  public List<String> getProductIds() {
    return productIds;
  }

  public PaymentType getPaymentType() {
    return paymentType;
  }

  public BigDecimal getPrice() {
    return price;
  }
}
