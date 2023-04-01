package com.example.control7.dto;

import com.example.control7.entity.Order;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Builder
public class OrderDto {
    public static OrderDto from(Order order){
        return builder()
                .id(order.getId())
                .clientId(order.getClientId())
                .dishId(order.getDishId())
                .dateTime(order.getDateTime())
                .build();
    }
    private Long id;
    private Long clientId;
    private Long dishId;
    private LocalDateTime dateTime;
}
