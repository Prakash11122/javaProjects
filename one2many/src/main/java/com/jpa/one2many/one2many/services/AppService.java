package com.jpa.one2many.one2many.services;

import com.jpa.one2many.one2many.entity.Addresses;
import com.jpa.one2many.one2many.entity.Student;
import com.jpa.one2many.one2many.repositories.AddressRepository;
import com.jpa.one2many.one2many.repositories.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private StudentRepository studentRepository;


    @Transactional
    public void saveData() {
        Addresses prakaashAddress1 = new Addresses("02 Bhopal", "Rajnagar", "Odisha");
        Addresses prakaashAddress2 = new Addresses("345 SastriPuram", "Raiput Road", "Dehradun");
        Addresses prakaashAddress3 = new Addresses("022 Balda Colony", "Locknow", "UP");


        Student prakaashStdInfo = new Student("Guna", 74388549);


        studentRepository.save(prakaashStdInfo);

        addressRepository.save(prakaashAddress1);
        addressRepository.save(prakaashAddress2);
        addressRepository.save(prakaashAddress3);

        System.out.println("data for student and address are inserted");

    }
}
