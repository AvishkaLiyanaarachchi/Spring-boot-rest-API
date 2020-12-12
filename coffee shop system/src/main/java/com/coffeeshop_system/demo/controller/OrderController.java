package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.Order;
import com.coffeeshop_system.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //mark class as Controller
@RequestMapping("/order") //handle the request
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping //creating a get mapping that retrieves all the order detail from the database
    public Iterable<Order> getAllOrders(){
        return orderService.getAllOrder();
    }
    @GetMapping("/{id}") //creating a get mapping that retrieves the detail of a specific order
    public Order getOrderByID(@PathVariable("id")int id){
        return orderService.getOrderById(id);
    }
    @PostMapping //creating post mapping that insert the order details to the database
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }
    @PutMapping //creating put mapping to update the order detail
    public int updateOrder(@RequestBody Order order){
        return orderService.updateOrder(order);
    }
    //creating a delete mapping that deletes a specified order
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id")int id){
        orderService.deleteOrder(id);
    }
}
