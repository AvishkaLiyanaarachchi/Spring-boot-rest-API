package com.coffeeshop_system.demo.service;

import com.coffeeshop_system.demo.model.Coffeeshop;
import com.coffeeshop_system.demo.repository.Coffeeshop_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeshopService {

    @Autowired
    Coffeeshop_repository coffeeshop_repository;
    //getting each coffee shop record by using the method findaAll() of JpaRepository
    public Iterable<Coffeeshop> getAllCoffeeshop(){
        return coffeeshop_repository.findAll();
    }
    //getting a specific coffee shop record by using the method findById() of JpaRepository
    public Coffeeshop getCoffeeshopByID(int id){
       return coffeeshop_repository.findById(id).get();
    }
    //saving a specific coffee shop record by using the method save() of JpaRepository
    public void addCoffeeshop(Coffeeshop coffeeshop){
      coffeeshop_repository.save(coffeeshop);
    }
    //updating a coffee shop record
    public int updateCoffeeshop(Coffeeshop coffeeshop){
        if(coffeeshop!= null){
            coffeeshop_repository.save(coffeeshop);
            return -1;
        }

        return -1;
    }
    //deleting a specific coffee shop record by using the method deleteById() of JpaRepository
    public void deleteCoffeeShop(int id){
        coffeeshop_repository.deleteById(id);
    }


}
