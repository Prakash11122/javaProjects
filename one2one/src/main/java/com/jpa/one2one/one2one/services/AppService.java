package com.jpa.one2one.one2one.services;

import com.jpa.one2one.one2one.entity.Addresses;
import com.jpa.one2one.one2one.entity.Student;
import com.jpa.one2one.one2one.repository.AddressRepository;
import com.jpa.one2one.one2one.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Transactional
    public void saveData(){
        Student prakaash = new Student("prakash",70772200);
        Addresses prakaashAddress = new Addresses("02 Bhopal", "Kenderapara","Odisha");
        addressRepository.save(prakaashAddress);
        studentRepository.save(prakaash);

        System.out.println("data for student and address table are inserted");
    }

}
