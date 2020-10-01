package com.example.springdataprojections.models.projections;

import com.example.springdataprojections.models.Address;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class CustomerNoId {

    private UUID uuid;

    private String firstName;

    private String lastName;

    private Address address;

}
