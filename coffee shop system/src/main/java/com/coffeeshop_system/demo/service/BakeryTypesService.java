package com.coffeeshop_system.demo.service;

import com.coffeeshop_system.demo.model.BakeryTypes;
import com.coffeeshop_system.demo.repository.BakeryTypes_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BakeryTypesService {
    @Autowired
    BakeryTypes_repository bakeryTypes_repository;
    //getting each bakery types record by using the method findaAll() of JpaRepository
    public Iterable<BakeryTypes> getAllBakeryTypes(){
        return bakeryTypes_repository.findAll();
    }
    //getting a specific bakery types record by using the method findById() of JpaRepository
    public BakeryTypes bakeryTypesbyId(int id){
        return bakeryTypes_repository.findById(id).get();
    }
    //saving a specific bakery types record by using the method save() of JpaRepository
    public void addBakeryTypes(BakeryTypes bakeryTypes){
        bakeryTypes_repository.save(bakeryTypes);
    }
    //updating a bakery types record
    public int updateBakeryTypes(BakeryTypes bakeryTypes){
        if(bakeryTypes != null){
            bakeryTypes_repository.save(bakeryTypes);
            return -1;
        }
        return -1;
    }
    //deleting a specific Bakery types record by using the method deleteById() of JpaRepository
    public void deleteBakeryTypes(int id){
        bakeryTypes_repository.deleteById(id);
    }
}
