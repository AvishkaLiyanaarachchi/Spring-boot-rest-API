package com.coffeeshop_system.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "tbl_bill")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bill_ID;
    private float amount;
    private Date date;
    private String 	description;
    private int tbl_customer_customer_id;
    private int tbl_customer_tbl_coffee_shop_coffee_shop_ID;

    public Payment(){

    }

    public Payment(int bill_ID, float amount, Date date, String description, int tbl_customer_customer_id, int tbl_customer_tbl_coffee_shop_coffee_shop_ID) {
        this.bill_ID = bill_ID;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.tbl_customer_customer_id = tbl_customer_customer_id;
        this.tbl_customer_tbl_coffee_shop_coffee_shop_ID = tbl_customer_tbl_coffee_shop_coffee_shop_ID;
    }

    public int getBill_ID() {
        return bill_ID;
    }

    public void setBill_ID(int bill_ID) {
        this.bill_ID = bill_ID;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
