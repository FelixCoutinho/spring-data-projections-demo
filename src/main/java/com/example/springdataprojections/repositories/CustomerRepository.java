package com.example.springdataprojections.repositories;

import com.example.springdataprojections.models.Customer;
import com.example.springdataprojections.models.projections.CustomerNoId;
import com.example.springdataprojections.models.projections.CustomerNoIdAndFullAddress;
import com.example.springdataprojections.models.projections.CustomerNoIdFullNameFullAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<CustomerNoId> findAllProjectBy();

    List<CustomerNoIdAndFullAddress> findCustomersNoIdAndFullAddressProjectedBy();

    List<CustomerNoIdFullNameFullAddress> findCustomersNoIdAndFullNameProjectedBy();

    @Override
    List<Customer> findAll();

    <T> List<T> findBy(Class<T> projection);

}
