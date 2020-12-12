package com.coffeeshop_system.demo.service;

import com.coffeeshop_system.demo.model.Order;
import com.coffeeshop_system.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    //getting each payment record by using the method findaAll() of JpaRepository
    public Iterable<Order> getAllOrder(){
        return orderRepository.findAll();
    }
    //getting a specific order record by using the method findById() of JpaRepository
    public Order getOrderById(int id){
        return orderRepository.findById(id).get();
    }
    //saving a specific order record by using the method save() of JpaRepository
    public void addOrder(Order order){
        orderRepository.save(order);
    }
    //updating a order record
    public int updateOrder(Order order){
        if(order != null){
            orderRepository.save(order);
            return -1;
        }
        return -1;
    }
    //deleting a specific order record by using the method deleteById() of JpaRepository
    public void deleteOrder(int id){
        orderRepository.deleteById(id);
    }
}
