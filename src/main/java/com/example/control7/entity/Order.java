package com.example.control7.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private Client client;
    private Dish dish;
    private LocalDateTime dateTime;

    public Order(Client client, Dish dish, LocalDateTime dateTime) {
        this.client = client;
        this.dish = dish;
        this.dateTime = dateTime;
    }
}
