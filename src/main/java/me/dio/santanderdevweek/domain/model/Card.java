package me.dio.santanderdevweek.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Card {
    private String number;
    private BigDecimal limit;
}
