package com.coffeeshop_system.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_bakery_types") //Specify the class is an entity and map
public class BakeryTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bakery_ID;
    private String 	bakery_types;
    private int tbl_order_order_id;
    private int tbl_order_tbl_customer_customer_id;
    private int tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID;

    public BakeryTypes(){

    }

    public BakeryTypes(int bakery_ID, String bakery_types, int tbl_order_order_id, int tbl_order_tbl_customer_customer_id, int tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID) {
        this.bakery_ID = bakery_ID;
        this.bakery_types = bakery_types;
        this.tbl_order_order_id = tbl_order_order_id;
        this.tbl_order_tbl_customer_customer_id = tbl_order_tbl_customer_customer_id;
        this.tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID = tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID;
    }

    public int getBakery_ID() {
        return bakery_ID;
    }

    public void setBakery_ID(int bakery_ID) {
        this.bakery_ID = bakery_ID;
    }

    public String getBakery_types() {
        return bakery_types;
    }

    public void setBakery_types(String bakery_types) {
        this.bakery_types = bakery_types;
    }

    public int getTbl_order_order_id() {
        return tbl_order_order_id;
    }

    public void setTbl_order_order_id(int tbl_order_order_id) {
        this.tbl_order_order_id = tbl_order_order_id;
    }

    public int getTbl_order_tbl_customer_customer_id() {
        return tbl_order_tbl_customer_customer_id;
    }

    public void setTbl_order_tbl_customer_customer_id(int tbl_order_tbl_customer_customer_id) {
        this.tbl_order_tbl_customer_customer_id = tbl_order_tbl_customer_customer_id;
    }

    public int getTbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID() {
        return tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID;
    }

    public void setTbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID(int tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID) {
        this.tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID = tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID;
    }
}
