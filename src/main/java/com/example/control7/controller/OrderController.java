package com.example.control7.controller;

import com.example.control7.dto.ClientDto;
import com.example.control7.dto.DishDto;
import com.example.control7.dto.OrderDto;
import com.example.control7.entity.Dish;
import com.example.control7.entity.Order;
import com.example.control7.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/orders")
    public ResponseEntity<OrderDto> makeOrder(@RequestBody OrderDto orderDto) {
        Order order = orderService.makeOrder(orderDto.getClientId(), orderDto.getDishId(),orderDto.getDateTime());
        return ResponseEntity.ok(OrderDto.from(order));
    }
    @GetMapping("/orders/client/{id}")
    public ResponseEntity<List<OrderDto>> getOrdersByClientId(@PathVariable Long clientId) {
        List<Order> orders = orderService.findByClientId(clientId);
        List<OrderDto> orderDtos = orders.stream().map(OrderDto::from).collect(Collectors.toList());
        return ResponseEntity.ok(orderDtos);
    }

}
