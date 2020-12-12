package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.Customer;
import com.coffeeshop_system.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //mark class as Controller
@RequestMapping("/customer") //handle the request
public class CustomerController {

    @Autowired //Autowire the CustomerService class
    CustomerService customerService;

    @GetMapping //creating a get mapping that retrieves all the customers detail from the database
    public Iterable<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @GetMapping("/{id}") //creating a get mapping that retrieves the detail of a specific customer
    public Customer getCustomerByID(@PathVariable("id") int id){
        return customerService.getCustomerByID(id);
    }

    @PostMapping //creating post mapping that insert the customers to the database
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomers(customer);
    }

    @PutMapping //creating put mapping to update the customer detail
    public int updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    //creating a delete mapping that deletes a specified customer
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") int id){
        customerService.deleteCustomer(id);
    }
}
