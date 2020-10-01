package com.example.springdataprojections.services;

import com.example.springdataprojections.models.Customer;
import com.example.springdataprojections.models.projections.CustomerNoId;
import com.example.springdataprojections.models.projections.CustomerNoIdAndFullAddress;
import com.example.springdataprojections.models.projections.CustomerNoIdFullNameFullAddress;
import com.example.springdataprojections.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReadAllCustomersService {

    private CustomerRepository customerRepository;

    public List<Customer> readAll() {
        return this.customerRepository.findAll();
    }

    public List<CustomerNoId> readAllCustomers() {
        return this.customerRepository.findAllProjectBy();
    }

    public List<CustomerNoIdAndFullAddress> readAllCustomersFullAddress() {
        return this.customerRepository.findCustomersNoIdAndFullAddressProjectedBy();
    }

    public List<CustomerNoIdFullNameFullAddress> readAllCustomersFullName() {
        return this.customerRepository.findCustomersNoIdAndFullNameProjectedBy();
    }

    public List<CustomerNoIdFullNameFullAddress> readAllGeneric() {
        return this.customerRepository.findBy(CustomerNoIdFullNameFullAddress.class);
    }

}
