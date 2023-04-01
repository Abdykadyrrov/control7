package com.example.control7.repository;

import com.example.control7.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {

    List<Dish> findDishesByRestaurantId(Long id);
}
