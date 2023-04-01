package com.example.control7.dto;

import com.example.control7.entity.Restaurant;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RestaurantDto {
    public static RestaurantDto from(Restaurant restaurant){
        return builder()
                .id(restaurant.getId())
                .name(restaurant.getName())
                .description(restaurant.getDescription())
                .build();
    }
    private Long id;
    private String name;
    private String description;
}
