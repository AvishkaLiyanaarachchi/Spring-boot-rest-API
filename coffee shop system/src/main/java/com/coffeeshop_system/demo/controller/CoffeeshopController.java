package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.Coffeeshop;
import com.coffeeshop_system.demo.service.CoffeeshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //mark class as Controller
@RequestMapping("/coffeeshop") //handle the request
public class CoffeeshopController {

    @Autowired
    private CoffeeshopService coffeeshopService;

    @GetMapping //creating a get mapping that retrieves all the coffee shop details  from the database
    public Iterable<Coffeeshop> getAllCoffeeshop(){
        return coffeeshopService.getAllCoffeeshop();
    }

    @GetMapping("/{id}")  //creating a get mapping that retrieves the detail of a specific coffee shop
    public Coffeeshop getCoffeeshopByID(@PathVariable("id") int id){
      return coffeeshopService.getCoffeeshopByID(id);
    }

    @PostMapping //creating post mapping that insert the coffee shop details to the database
    public void addCoffeeshop(@RequestBody Coffeeshop coffeeshop){
      coffeeshopService.addCoffeeshop(coffeeshop);
    }

    @PutMapping //creating put mapping to update the coffee shop details
    public int updateCoffeeshop(@RequestBody Coffeeshop coffeeshop) {

        return coffeeshopService.updateCoffeeshop(coffeeshop);
    }
    @DeleteMapping("/{id}") //creating a delete mapping that deletes a specified coffee shop
    public void deleteCoffeeshop(@PathVariable int id){
        coffeeshopService.deleteCoffeeShop(id);
    }




}
