package me.dio.santanderdevweek.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Account {
    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;

}
