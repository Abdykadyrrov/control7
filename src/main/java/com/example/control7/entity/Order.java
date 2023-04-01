package com.example.control7.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    private Long id;
    private Long clientID;
    private Long dishId;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    public Order(Long clientID, Long dishId, LocalDateTime dateTime) {
        this.clientID = clientID;
        this.dishId = dishId;
        this.dateTime = dateTime;
    }
}
