package com.example.springdataprojections.models.projections;

import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

public interface CustomerNoIdAndFullAddress {

    UUID getUuid();

    String getFirstName();

    String getLastName();

    @Value("#{target.address.street + ', ' + target.address.city + '/' + target.address.province + ' - ' + target.address.postalCode }")
    String getAddress();

}
