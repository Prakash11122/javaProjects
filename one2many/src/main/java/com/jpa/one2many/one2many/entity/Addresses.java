package com.jpa.one2many.one2many.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Address")
@Data
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String houseDetails;
    private String city;
    private String state;


    public Addresses() {
    }

    public Addresses(String houseDetails, String city, String state) {
        this.houseDetails = houseDetails;
        this.city = city;
        this.state = state;
    }

}
