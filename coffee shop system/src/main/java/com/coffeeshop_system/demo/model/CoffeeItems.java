package com.coffeeshop_system.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_coffee_items")
public class CoffeeItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int item_id;
    private String 	item_name;
    private int quantity;
    private int tbl_coffee_types_coffee_types_id;
    private int tbl_coffee_types_tbl_order_order_id;

    public CoffeeItems(){

    }

    public CoffeeItems(int item_id, String item_name, int quantity, int tbl_coffee_types_coffee_types_id, int tbl_coffee_types_tbl_order_order_id) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.quantity = quantity;
        this.tbl_coffee_types_coffee_types_id = tbl_coffee_types_coffee_types_id;
        this.tbl_coffee_types_tbl_order_order_id = tbl_coffee_types_tbl_order_order_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTbl_coffee_types_coffee_types_id() {
        return tbl_coffee_types_coffee_types_id;
    }

    public void setTbl_coffee_types_coffee_types_id(int tbl_coffee_types_coffee_types_id) {
        this.tbl_coffee_types_coffee_types_id = tbl_coffee_types_coffee_types_id;
    }

    public int getTbl_coffee_types_tbl_order_order_id() {
        return tbl_coffee_types_tbl_order_order_id;
    }

    public void setTbl_coffee_types_tbl_order_order_id(int tbl_coffee_types_tbl_order_order_id) {
        this.tbl_coffee_types_tbl_order_order_id = tbl_coffee_types_tbl_order_order_id;
    }
}
