package com.example.control7.dto;

import com.example.control7.entity.Client;
import com.example.control7.entity.Dish;
import com.example.control7.entity.Order;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class OrderDto {
    public static OrderDto from(Order order){
        return builder()
                .id(order.getId())
                .clientId(order.getClientID())
                .dishId(order.getDishId())
                .dateTime(order.getDateTime())
                .build();
    }
    private Long id;
    private Long clientId;
    private Long dishId;
    private LocalDateTime dateTime;
}
