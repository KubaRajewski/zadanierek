package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {

    private String id;

    private BigDecimal value;

    private List<String> promotions;

}
