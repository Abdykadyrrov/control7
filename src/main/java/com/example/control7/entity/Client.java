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
public class Client {
    @Id
    private Long id;
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
