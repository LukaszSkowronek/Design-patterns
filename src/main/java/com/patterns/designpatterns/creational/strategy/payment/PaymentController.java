package com.empik.cms.dynamic.configuration.service.adapter.api.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;

@RestController
@RequestMapping("/api")
public class PaymentController {

  private final PaymentService paymentService;

  public PaymentController(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  @GetMapping("/pay/{price}/{type}")
  public PaymentResult pay(@PathVariable("price") final String price, @PathVariable("type") final PaymentType type) {
    return paymentService.pay(new PaymentInfo(Arrays.asList("123", "32"), type, BigDecimal.valueOf(Integer.parseInt(price))));

  }
}
