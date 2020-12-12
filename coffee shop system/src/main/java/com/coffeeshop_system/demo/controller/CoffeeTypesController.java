package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.CoffeeTypes;
import com.coffeeshop_system.demo.service.CoffeeTypesService;
import com.coffeeshop_system.demo.service.CoffeeshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //mark class as Controller
@RequestMapping("/coffeeTypes") //handle the request
public class CoffeeTypesController {

    @Autowired
    CoffeeTypesService coffeeTypesService;

    @GetMapping //creating a get mapping that retrieves all the coffee types detail from the database
    public Iterable<CoffeeTypes> getAllCoffeeTypes(){
        return coffeeTypesService.getAllCoffeeTypes();
    }
    @GetMapping("/{id}") //creating a get mapping that retrieves the detail of a specific coffeeTypes
    public CoffeeTypes getCoffeeTypesbyId(@PathVariable("id")int id){
        return coffeeTypesService.getCoffeeTypesbyId(id);
    }
    @PostMapping //creating post mapping that insert the order details to the database
    public void addCoffeeTypes(@RequestBody CoffeeTypes coffeeTypes){
        coffeeTypesService.addCoffeeTypes(coffeeTypes);
    }
    @PutMapping //creating put mapping to update the coffeetypes detail
    public int updateCoffeTypes(@RequestBody CoffeeTypes coffeeTypes){
        return coffeeTypesService.updateCoffeeTypes(coffeeTypes);
    }
    //creating a delete mapping that deletes a specified coffeetypes
    @DeleteMapping("/{id}")
    public void deleteCoffeeTypes(@PathVariable("id") int id){
        coffeeTypesService.deleteCoffeeTypes(id);
    }
}
