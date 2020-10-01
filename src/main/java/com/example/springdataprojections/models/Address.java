package com.example.springdataprojections.models;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {

    private String street;

    private String city;

    private String province;

    private String postalCode;

}
