package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.Coffeeshop;
import com.coffeeshop_system.demo.service.CoffeeshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //It marks the class as a controller where every method returns a domain object instead of a view
@RequestMapping("/coffeeshop") //handle the request
public class CoffeeshopController {

    @Autowired
    private CoffeeshopService coffeeshopService;

    @GetMapping //It used to handle the HTTP get request
    public Iterable<Coffeeshop> getAllCoffeeshop(){
        return coffeeshopService.getAllCoffeeshop();
    }

    @GetMapping("/{id}")
    public Coffeeshop getCoffeeshopByID(@PathVariable("id") int id){
      return coffeeshopService.getCoffeeshopByID(id);
    }

    @PostMapping
    public void addCoffeeshop(@RequestBody Coffeeshop coffeeshop){
      coffeeshopService.addCoffeeshop(coffeeshop);
    }

    @PutMapping //It used handle the HTTP put request
    public int updateCoffeeshop(@RequestBody Coffeeshop coffeeshop) {

        return coffeeshopService.updateCoffeeshop(coffeeshop);
    }
    @DeleteMapping("/{id}") //It used to handle the HTTP delete request
    public void deleteCoffeeshop(@PathVariable int id){
        coffeeshopService.deleteCoffeeShop(id);
    }




}
