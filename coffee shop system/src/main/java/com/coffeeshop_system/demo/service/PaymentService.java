package com.coffeeshop_system.demo.service;

import com.coffeeshop_system.demo.model.Payment;
import com.coffeeshop_system.demo.repository.Payment_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    Payment_repository payment_repository;
    //getting each payment record by using the method findaAll() of JpaRepository
    public Iterable<Payment> getAllPayment(){
        return payment_repository.findAll();
    }
    //getting a specific payment record by using the method findById() of JpaRepository
    public Payment getPaymentByID(int id){
        return payment_repository.findById(id).get();
    }
    //saving a specific payment record by using the method save() of JpaRepository
    public void addPayment(Payment payment){
        payment_repository.save(payment);
    }

    //updating a payment record
    public int updatePayment(Payment payment){
        if(payment != null){
            payment_repository.save(payment);
            return -1;
        }
        return -1;
    }
    //deleting a specific employee record by using the method deleteById() of JpaRepository
    public void deletePayment(int id){
        payment_repository.deleteById(id);
    }
}
