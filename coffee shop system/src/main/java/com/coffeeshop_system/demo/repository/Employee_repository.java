package com.coffeeshop_system.demo.repository;

import com.coffeeshop_system.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_repository extends JpaRepository<Employee, Integer> {

}
