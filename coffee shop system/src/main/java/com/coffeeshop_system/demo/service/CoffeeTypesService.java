package com.coffeeshop_system.demo.service;

import com.coffeeshop_system.demo.model.CoffeeTypes;
import com.coffeeshop_system.demo.model.Coffeeshop;
import com.coffeeshop_system.demo.model.Order;
import com.coffeeshop_system.demo.repository.CoffeeTypes_repository;
import com.coffeeshop_system.demo.repository.Coffeeshop_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeTypesService {
    @Autowired
    CoffeeTypes_repository coffeeTypes_repository;

    //getting each payment record by using the method findaAll() of JpaRepository
    public Iterable<CoffeeTypes> getAllCoffeeTypes(){
        return coffeeTypes_repository.findAll();
    }
    //getting a specific order record by using the method findById() of JpaRepository
    public CoffeeTypes getCoffeeTypesbyId(int id){
        return coffeeTypes_repository.findById(id).get();
    }
    //saving a specific coffeeTypes record by using the method save() of JpaRepository
    public void addCoffeeTypes(CoffeeTypes coffeeTypes){
        coffeeTypes_repository.save(coffeeTypes);
    }
    //updating a coffeetypes record
    public int updateCoffeeTypes(CoffeeTypes coffeeTypes){
        if(coffeeTypes != null){
            coffeeTypes_repository.save(coffeeTypes);
            return -1;
        }
        return -1;
    }
    //deleting a specific coffeeTypes record by using the method deleteById() of JpaRepository
    public void deleteCoffeeTypes(int id){
        coffeeTypes_repository.deleteById(id);
    }

}
