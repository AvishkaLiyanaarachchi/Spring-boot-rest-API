package com.coffeeshop_system.demo.service;

import com.coffeeshop_system.demo.model.Coffeeshop;
import com.coffeeshop_system.demo.repository.Coffeeshop_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeshopService {

    @Autowired
    Coffeeshop_repository coffeeshop_repository;

    public Iterable<Coffeeshop> getAllCoffeeshop(){
        return coffeeshop_repository.findAll();
    }

    public Coffeeshop getCoffeeshopByID(int id){
       return coffeeshop_repository.findById(id).get();
    }

    public void addCoffeeshop(Coffeeshop coffeeshop){
      coffeeshop_repository.save(coffeeshop);
    }

    public int updateCoffeeshop(Coffeeshop coffeeshop){
        if(coffeeshop!= null){
            coffeeshop_repository.save(coffeeshop);
            return -1;
        }

        return -1;
    }

    public void deleteCoffeeShop(int id){
        coffeeshop_repository.deleteById(id);
    }


}
