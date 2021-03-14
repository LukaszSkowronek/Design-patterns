package com.empik.cms.dynamic.configuration.service.adapter.api.payment;

import com.google.common.base.Preconditions;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class PaymentInfo {

  private final List<String> productIds;
  private final PaymentType paymentType;
  private final BigDecimal price;

  public PaymentInfo(List<String> productIds, PaymentType paymentType, BigDecimal price) {
    Preconditions.checkArgument(!Objects.isNull(price), "hahaha");
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
