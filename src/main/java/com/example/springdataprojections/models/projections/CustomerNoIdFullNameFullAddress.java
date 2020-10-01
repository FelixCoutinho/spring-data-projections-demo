package com.example.springdataprojections.models.projections;

import com.example.springdataprojections.models.Address;
import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

public interface CustomerNoIdFullNameFullAddress {

    UUID getUuid();

    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullName();

    @Value("#{target.address.street + ', ' + target.address.city + '/' + target.address.province + ' - ' + target.address.postalCode }")
    String getFullAddress();

}
