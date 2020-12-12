package com.coffeeshop_system.demo.repository;

import com.coffeeshop_system.demo.model.CoffeeItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeItems_repository extends JpaRepository<CoffeeItems,Integer> {
}
