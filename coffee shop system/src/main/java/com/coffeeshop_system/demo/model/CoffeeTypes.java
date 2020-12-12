package com.coffeeshop_system.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_coffee_types") //Specify the class is an entity and map to the database table
public class CoffeeTypes {
    @Id //specify the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremented database column to generate the primary key
    private int coffee_types_id;
    private String 	coffee_types_name;
    private String quantity;
    private double 	cost;
    private int tbl_order_order_id;

    public CoffeeTypes(){

    }

    public CoffeeTypes(int coffee_types_id, String coffee_types_name, String quantity, double cost, int tbl_order_order_id) {
        this.coffee_types_id = coffee_types_id;
        this.coffee_types_name = coffee_types_name;
        this.quantity = quantity;
        this.cost = cost;
        this.tbl_order_order_id = tbl_order_order_id;
    }

    public int getCoffee_types_id() {
        return coffee_types_id;
    }

    public void setCoffee_types_id(int coffee_types_id) {
        this.coffee_types_id = coffee_types_id;
    }

    public String getCoffee_types_name() {
        return coffee_types_name;
    }

    public void setCoffee_types_name(String coffee_types_name) {
        this.coffee_types_name = coffee_types_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTbl_order_order_id() {
        return tbl_order_order_id;
    }

    public void setTbl_order_order_id(int tbl_order_order_id) {
        this.tbl_order_order_id = tbl_order_order_id;
    }
}
