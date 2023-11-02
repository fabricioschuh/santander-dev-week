package me.dio.santanderdevweek.model;

import me.dio.santanderdevweek.domain.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }


    @Test
    void insertAccountData() {
        account.setAgency("0001");
        account.setNumber("123456");
        account.setBalance(new BigDecimal(100.50));
        account.setLimit(new BigDecimal(500.75));

        assertThat(account.getAgency()).isEqualTo("0001");
        assertThat(account.getNumber()).isEqualTo("123456");
        assertThat(account.getBalance()).isEqualTo(BigDecimal.valueOf(100.50));
        assertThat(account.getLimit()).isEqualTo(BigDecimal.valueOf(500.75));
    }


}
