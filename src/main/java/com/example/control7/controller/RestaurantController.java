package com.example.control7.controller;

import com.example.control7.dto.RestaurantDto;
import com.example.control7.entity.Restaurant;
import com.example.control7.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }
    @GetMapping("/restaurants")
    public ResponseEntity<List<RestaurantDto>> getRestaurants() {
        List<Restaurant> restaurants = restaurantService.findAll();
        List<RestaurantDto> restaurantDtos = restaurants.stream().map(RestaurantDto::from).collect(Collectors.toList());
        return ResponseEntity.ok(restaurantDtos);
    }
}
