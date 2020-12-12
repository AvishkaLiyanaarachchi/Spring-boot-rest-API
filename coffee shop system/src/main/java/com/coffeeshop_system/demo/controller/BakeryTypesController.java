package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.BakeryTypes;
import com.coffeeshop_system.demo.service.BakeryTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //mark class as Controller
@RequestMapping("/bakeryTypes") //handle the request
public class BakeryTypesController {
    @Autowired
    BakeryTypesService bakeryTypesService;
    @GetMapping //creating a get mapping that retrieves all the bakery types  from the database
    public Iterable<BakeryTypes> getAllBakeryTypes(){
        return bakeryTypesService.getAllBakeryTypes();
    }
    //creating a get mapping that retrieves the detail of a specific bakery types
    @GetMapping("{id}")
    public BakeryTypes getBakeryTypesbyID(@PathVariable("id")int id){
        return bakeryTypesService.bakeryTypesbyId(id);
    }

    @PostMapping //creating post mapping that insert the bakery types details to the database
    public void addBakeryTypes(@RequestBody BakeryTypes bakeryTypes){
        bakeryTypesService.addBakeryTypes(bakeryTypes);
    }

    @PutMapping //creating put mapping to update the bakery types detail
    public int updateBakeryTypes(@RequestBody BakeryTypes bakeryTypes){
        return bakeryTypesService.updateBakeryTypes(bakeryTypes);
    }
    //creating a delete mapping that deletes a specified bakery types
    @DeleteMapping("{id}")
    public void deleteBakeryTypes(@PathVariable("id")int id){
        bakeryTypesService.deleteBakeryTypes(id);
    }


}
