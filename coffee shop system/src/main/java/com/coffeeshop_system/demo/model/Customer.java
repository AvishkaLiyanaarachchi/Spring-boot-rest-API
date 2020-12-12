package com.coffeeshop_system.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_customer") //Specify the class is an entity and map to the database table
public class Customer {
    @Id //specify the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremented database column to generate the primary key
    private int customer_id;
    private String customer_name;
    private String 	email_address;
    private String  conatact_num;
    private String address;
    private int tbl_coffee_shop_coffee_shop_ID;

    public Customer(){

    }

    public Customer(int customer_id, String customer_name, String email_address, String conatact_num, String address, int tbl_coffee_shop_coffee_shop_ID) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.email_address = email_address;
        this.conatact_num = conatact_num;
        this.address = address;
        this.tbl_coffee_shop_coffee_shop_ID = tbl_coffee_shop_coffee_shop_ID;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getConatact_num() {
        return conatact_num;
    }

    public void setConatact_num(String conatact_num) {
        this.conatact_num = conatact_num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTbl_coffee_shop_coffee_shop_ID() {
        return tbl_coffee_shop_coffee_shop_ID;
    }

    public void setTbl_coffee_shop_coffee_shop_ID(int tbl_coffee_shop_coffee_shop_ID) {
        this.tbl_coffee_shop_coffee_shop_ID = tbl_coffee_shop_coffee_shop_ID;
    }
}
