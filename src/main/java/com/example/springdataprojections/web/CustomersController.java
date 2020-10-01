package com.example.springdataprojections.web;

import com.example.springdataprojections.models.Customer;
import com.example.springdataprojections.services.ReadAllCustomersService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomersController {

    final private ReadAllCustomersService readAllCustomersService;

    @GetMapping
    public ResponseEntity<List> getCustomers(){
        return ResponseEntity.ok(this.readAllCustomersService.readAll());
    }

    @GetMapping("/no-id")
    public ResponseEntity<List> getCustomersNoId(){
        return ResponseEntity.ok(this.readAllCustomersService.readAllCustomers());
    }

    @GetMapping("/full-address")
    public ResponseEntity<List> getCustomersFullAddress(){
        return ResponseEntity.ok(this.readAllCustomersService.readAllCustomersFullAddress());
    }

    @GetMapping("/full-name")
    public ResponseEntity<List> getCustomersFullName(){
        return ResponseEntity.ok(this.readAllCustomersService.readAllCustomersFullName());
    }

    @GetMapping("/generic")
    public ResponseEntity<List> getCustomersGeneric(){
        return ResponseEntity.ok(this.readAllCustomersService.readAllGeneric());
    }

}
