package com.example.control7.controller;

import com.example.control7.dto.RestaurantDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RestaurantController {
    public ResponseEntity<List<RestaurantDto>> getRestaurants() {
        return null;
    }
}
