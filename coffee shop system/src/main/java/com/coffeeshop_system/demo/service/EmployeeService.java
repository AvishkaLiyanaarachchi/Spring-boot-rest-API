package com.coffeeshop_system.demo.service;

import com.coffeeshop_system.demo.model.Employee;
import com.coffeeshop_system.demo.repository.Employee_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    Employee_repository employee_repository;
    //getting each employee record by using the method findaAll() of JpaRepository
    public Iterable<Employee> getAllEmployee(){
        return employee_repository.findAll();
    }

    //getting a specific employee record by using the method findById() of JpaRepository
    public Employee getEmployeeByID(int id){
        return employee_repository.findById(id).get();
    }
    //saving a specific employee record by using the method save() of JpaRepository
    public void addEmployee(Employee employee){
        employee_repository.save(employee);
    }

    //updating a employee record
    public int updateEmploee(Employee employee){
        if(employee != null){
            employee_repository.save(employee);
            return -1;
        }
        return -1;
    }
    //deleting a specific employee record by using the method deleteById() of JpaRepository
    public void deleteEmployee(int id){
        employee_repository.deleteById(id);
    }
}
