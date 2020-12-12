package com.coffeeshop_system.demo.service;

import com.coffeeshop_system.demo.model.Customer;
import com.coffeeshop_system.demo.repository.Customer_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    Customer_repository customer_repository;
    //getting each customer record by using the method findaAll() of JpaRepository
    public Iterable<Customer> getAllCustomer(){
        return customer_repository.findAll();
    }
    //getting a specific customer record by using the method findById() of JpaRepository
    public Customer getCustomerByID(int id){
        return customer_repository.findById(id).get();
    }
    //saving a specific customer record by using the method save() of JpaRepository
    public void addCustomers(Customer customer){
        customer_repository.save(customer);
    }

    //updating a customer record
    public int updateCustomer(Customer customer){
        if(customer != null){
            customer_repository.save(customer);
            return -1;
        }
        return -1;
    }
    //deleting a specific employee record by using the method deleteById() of JpaRepository
    public void deleteCustomer(int id){
        customer_repository.deleteById(id);
    }
}
