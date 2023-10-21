package me.dio.santanderdevweek.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private Account account;
    private Feature[] features;
    private Card card;
    private News[] news;
}
