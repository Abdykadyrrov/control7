package com.example.control7.controller;

import com.example.control7.dto.DishDto;
import com.example.control7.dto.RestaurantDto;
import com.example.control7.entity.Dish;
import com.example.control7.service.DishService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DishController {
    private final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }
    @GetMapping("/restaurants/{restaurantId}/dishes")
    public ResponseEntity<List<DishDto>> getAllDishByRestaurant(@PathVariable Long restaurantId) {
        List<Dish> dishes = dishService.findByRestaurantId(restaurantId);
        List<DishDto> dishDtos = dishes.stream().map(DishDto::from).collect(Collectors.toList());
        return ResponseEntity.ok(dishDtos);
    }
}
