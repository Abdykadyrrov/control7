package com.example.control7.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "client_id")
    private Long clientId;
    @JoinColumn(name = "dish_id")
    private Long dishId;
    @Column(name = "date_time",columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    public Order(Long clientId, Long dishId, LocalDateTime dateTime) {
        this.clientId = clientId;
        this.dishId = dishId;
        this.dateTime = dateTime;
    }
}
