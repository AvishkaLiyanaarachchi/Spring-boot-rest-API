package com.coffeeshop_system.demo.repository;

import com.coffeeshop_system.demo.model.CoffeeTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeTypes_repository extends JpaRepository<CoffeeTypes,Integer> {
}
