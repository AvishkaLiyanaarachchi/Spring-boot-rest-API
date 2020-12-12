package com.coffeeshop_system.demo.repository;

import com.coffeeshop_system.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
