package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@AllArgsConstructor
public class PaymentMethod {

    private String id;

    private BigInteger discount;

    private BigDecimal limit;

}
