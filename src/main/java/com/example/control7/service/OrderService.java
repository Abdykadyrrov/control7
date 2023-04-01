package com.example.control7.service;

import com.example.control7.entity.Client;
import com.example.control7.entity.Order;
import com.example.control7.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> findByClientId(Long clientId){
        return orderRepository.findAllByClientID(clientId);
    }
    public Order makeOrder(Long clientId, Long dishId, LocalDateTime dateTime) throws IllegalStateException {
        return orderRepository.save(new Order(clientId,dishId,dateTime));
    }

}
