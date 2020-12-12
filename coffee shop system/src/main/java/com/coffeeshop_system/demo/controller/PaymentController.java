package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.Payment;
import com.coffeeshop_system.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //mark class as Controller
@RequestMapping("/payment") //handle the request
public class PaymentController {
    @Autowired //Autowire the PaymentService class
    PaymentService paymentService;

    @GetMapping //creating a get mapping that retrieves all the payment detail from the database
    public Iterable<Payment> getAllPayment(){
        return paymentService.getAllPayment();
    }
    @GetMapping("/{id}") //creating a get mapping that retrieves the detail of a specific payment
    public Payment getPaymentByID(@PathVariable("id") int id){
        return paymentService.getPaymentByID(id);
    }
    @PostMapping //creating post mapping that insert the payment details to the database
    public void addpayment(@RequestBody Payment payment){
        paymentService.addPayment(payment);
    }

    @PutMapping //creating put mapping to update the payment detail
    public int updatePayment(@RequestBody Payment payment){
        return paymentService.updatePayment(payment);
    }
    //creating a delete mapping that deletes a specified payment
    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable("id") int id){
        paymentService.deletePayment(id);
    }
}
