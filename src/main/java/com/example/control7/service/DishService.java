package com.example.control7.service;

import com.example.control7.entity.Dish;
import com.example.control7.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    private final DishRepository dishRepository;

    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public List<Dish> findByRestaurantId(Long restaurantId){
        return dishRepository.findDishesByRestaurantId(restaurantId);
    }
}
