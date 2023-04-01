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
                .client(order.getClient())
                .dish(order.getDish())
                .dateTime(order.getDateTime())
                .build();
    }
    private Long id;
    private Client client;
    private Dish dish;
    private LocalDateTime dateTime;
}
