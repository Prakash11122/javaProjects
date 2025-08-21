package com.jpa.one2many.one2many.services;

import com.jpa.one2many.one2many.entity.Addresses;
import com.jpa.one2many.one2many.entity.Student;
import com.jpa.one2many.one2many.repositories.AddressRepository;
import com.jpa.one2many.one2many.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired
    AddressRepository addressRepository;

    @Autowired
    StudentRepository studentRepository;


    public void saveData(){
        Addresses prakaashAddress = new Addresses("02 Bhopal", "Rajnagar", "Odisha");
        Student prakaash = new Student("Guna", 74388549);
    }
}
