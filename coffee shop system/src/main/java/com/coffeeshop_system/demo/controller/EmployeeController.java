package com.coffeeshop_system.demo.controller;

import com.coffeeshop_system.demo.model.Employee;
import com.coffeeshop_system.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //mark class as Controller
@RequestMapping("/employee") //handle the request
public class EmployeeController {
    @Autowired //Autowire the EmployeeService class
    EmployeeService employeeService;

    @GetMapping //creating a get mapping that retrieves all the employees detail from the database
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("/{id}") //creating a get mapping that retrieves the detail of a specific employee
    public Employee getEmployeeByID(@PathVariable("id") int id){
        return employeeService.getEmployeeByID(id);
    }
    @PostMapping //creating post mapping that insert the employee to the database
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
    //creating put mapping to update the employee detail
    @PutMapping
    public int updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmploee(employee);
    }
    //creating a delete mapping that deletes a specified employee
    @DeleteMapping("/{id}")
    public void deleteEmployeeByID(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }

}
