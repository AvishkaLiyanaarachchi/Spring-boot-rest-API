package com.coffeeshop_system.demo.repository;

import com.coffeeshop_system.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_repository extends JpaRepository<Customer,Integer> {

}
