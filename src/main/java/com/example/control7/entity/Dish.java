package com.example.control7.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Dish {
    @Id
    private Long id;
    private String name;
    private String type;
    private double price;
    private Long restaurantId;

    public Dish(String name, String type, double price, Long restaurantId) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.restaurantId = restaurantId;
    }
}
