package com.coffeeshop_system.demo.repository;

import com.coffeeshop_system.demo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Payment_repository extends JpaRepository<Payment,Integer> {
}
