package com.example.control7.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
