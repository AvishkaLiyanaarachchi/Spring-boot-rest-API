package com.coffeeshop_system.demo.service;

import com.coffeeshop_system.demo.model.CoffeeItems;
import com.coffeeshop_system.demo.repository.CoffeeItems_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeItemsService {
    @Autowired
    CoffeeItems_repository coffeeItems_repository;
    //getting each coffee items record by using the method findaAll() of JpaRepository
    public Iterable<CoffeeItems> getAllCoffeeItems(){
        return coffeeItems_repository.findAll();
    }
    //getting a specific coffee item record by using the method findById() of JpaRepository
    public CoffeeItems getCoffeeItemsbyId(int id){
        return coffeeItems_repository.findById(id).get();
    }
    //saving a specific coffee items record by using the method save() of JpaRepository
    public void addCoffeeItems(CoffeeItems coffeeItems){
        coffeeItems_repository.save(coffeeItems);
    }
    //updating a coffee items record
    public int updateCoffeeItems(CoffeeItems coffeeItems){
        if(coffeeItems != null){
            coffeeItems_repository.save(coffeeItems);
            return -1;
        }
        return -1;
    }
    //deleting a specific coffee items record by using the method deleteById() of JpaRepository
    public void deleteCoffeeItems(int id){
        coffeeItems_repository.deleteById(id);
    }
}
