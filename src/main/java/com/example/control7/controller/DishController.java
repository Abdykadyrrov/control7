package com.example.control7.controller;

import com.example.control7.dto.RestaurantDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class DishController {
    public ResponseEntity<List<RestaurantDto>> getAllDishByRestaurant(@PathVariable Long restaurantId) {
        return null;
    }
}
