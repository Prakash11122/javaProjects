package com.jpa.one2many.one2many.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Address")
@Data
public class Addresses {

    @Id
    @SequenceGenerator(name = "start_form_1000", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "start_form_1000")
    private int addressId;

    private String houseDetails;

    private String city;

    private String state;


    @OneToMany
    private Student student;


    public Addresses() {
    }

    public Addresses(String houseDetails, String city, String state) {
        this.houseDetails = houseDetails;
        this.city = city;
        this.state = state;
    }

}
