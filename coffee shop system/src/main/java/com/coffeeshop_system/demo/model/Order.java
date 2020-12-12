package com.coffeeshop_system.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private String order_name;
    private String 	item_name;
    private String 	quantity;
    private int tbl_customer_customer_id;
    private int tbl_customer_tbl_coffee_shop_coffee_shop_ID;

    public Order(){

    }

    public Order(int order_id, String order_name, String item_name, String quantity, int tbl_customer_customer_id, int tbl_customer_tbl_coffee_shop_coffee_shop_ID) {
        this.order_id = order_id;
        this.order_name = order_name;
        this.item_name = item_name;
        this.quantity = quantity;
        this.tbl_customer_customer_id = tbl_customer_customer_id;
        this.tbl_customer_tbl_coffee_shop_coffee_shop_ID = tbl_customer_tbl_coffee_shop_coffee_shop_ID;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getTbl_customer_customer_id() {
        return tbl_customer_customer_id;
    }

    public void setTbl_customer_customer_id(int tbl_customer_customer_id) {
        this.tbl_customer_customer_id = tbl_customer_customer_id;
    }

    public int getTbl_customer_tbl_coffee_shop_coffee_shop_ID() {
        return tbl_customer_tbl_coffee_shop_coffee_shop_ID;
    }

    public void setTbl_customer_tbl_coffee_shop_coffee_shop_ID(int tbl_customer_tbl_coffee_shop_coffee_shop_ID) {
        this.tbl_customer_tbl_coffee_shop_coffee_shop_ID = tbl_customer_tbl_coffee_shop_coffee_shop_ID;
    }
}
