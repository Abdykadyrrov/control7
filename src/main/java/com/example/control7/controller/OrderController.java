package com.example.control7.controller;

import com.example.control7.dto.OrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class OrderController {
    @PostMapping("/orders")
    public ResponseEntity<OrderDto> makeOrder(@RequestBody OrderDto orderDto) {
        return null;
    }
    @GetMapping("/orders/client/{id}")
    public ResponseEntity<List<OrderDto>> getTaskDetails(@PathVariable Long id) {
        return null;
    }

}
