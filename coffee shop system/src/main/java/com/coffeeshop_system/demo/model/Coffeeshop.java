package com.coffeeshop_system.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_coffee_shop") //Specify the class is an entity and map to the database table
public class Coffeeshop {
    @Id //specify the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremented database column to generate the primary key
  private int coffee_shop_ID;
  private String shop_name;
  private String Address;
  private String phone_number;

  public Coffeeshop(){

  }

  public Coffeeshop(int coffee_shop_ID, String shop_name, String address, String phone_number) {
        this.coffee_shop_ID = coffee_shop_ID;
        this.shop_name = shop_name;
        this.Address = address;
        this.phone_number = phone_number;
  }

    public int getCoffee_shop_ID() {
        return coffee_shop_ID;
    }

    public void setCoffee_shop_ID(int coffee_shop_ID) {
        this.coffee_shop_ID = coffee_shop_ID;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
