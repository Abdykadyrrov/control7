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
public class Restaurant {
    @Id
    private Long id;
    private String name;
    private String description;

    public Restaurant(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
