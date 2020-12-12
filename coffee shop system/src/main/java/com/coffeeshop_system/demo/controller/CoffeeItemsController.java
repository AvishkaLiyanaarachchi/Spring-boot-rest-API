package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.CoffeeItems;
import com.coffeeshop_system.demo.service.CoffeeItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //mark class as Controller
@RequestMapping("/coffeeitems") //handle the request
public class CoffeeItemsController {
    @Autowired
    CoffeeItemsService coffeeItemsService;
    @GetMapping //creating a get mapping that retrieves all the coffee items  from the database
    public Iterable<CoffeeItems> getAllCoffeeItems(){
        return coffeeItemsService.getAllCoffeeItems();
    }
    @GetMapping("/{id}") //creating a get mapping that retrieves the detail of a specific coffee items
    public CoffeeItems getCoffeeItemsbyId(@PathVariable("id")int id){
        return coffeeItemsService.getCoffeeItemsbyId(id);
    }
    @PostMapping //creating post mapping that insert the coffee item details to the database
    public void addCoffeeItems(@RequestBody CoffeeItems coffeeItems){
        coffeeItemsService.addCoffeeItems(coffeeItems);
    }
    @PutMapping //creating put mapping to update the coffee items detail
    public int updateCoffeeItems(@RequestBody CoffeeItems coffeeItems){
        return coffeeItemsService.updateCoffeeItems(coffeeItems);
    }
    //creating a delete mapping that deletes a specified coffee items
    @DeleteMapping("/{id}")
    public void deleteCoffeeItems(@PathVariable("id")int id){
        coffeeItemsService.deleteCoffeeItems(id);
    }
}
