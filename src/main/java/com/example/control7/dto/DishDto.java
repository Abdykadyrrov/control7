package com.example.control7.dto;

import com.example.control7.entity.Client;
import com.example.control7.entity.Dish;
import com.example.control7.entity.Restaurant;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DishDto {
    public static DishDto from(Dish dish){
        return builder()
                .id(dish.getId())
                .name(dish.getName())
                .type(dish.getType())
                .price(dish.getPrice())
                .restaurantId(dish.getRestaurantId())
                .build();
    }
    private Long id;
    private String name;
    private String type;
    private double price;
    private Long restaurantId;

}
