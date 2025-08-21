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
    public void saveData() {
        Addresses prakaashAddress = new Addresses("02 Bhopal", "Kenderapara", "Odisha");
        Student prakaash = new Student("prakash", 70772200, prakaashAddress);

        //addressRepository.save(prakaashAddress);
        studentRepository.save(prakaash);

        System.out.println("data for student and address table are inserted");
    }

    @Transactional
    public void fetchStudent1Record() {
        Student studentData = studentRepository.findById(1).get();
        System.out.println(studentData);
        System.out.println(studentData.getAddresses().getState());

//        Addresses addresses = studentData.getAddresses();
//        System.out.println(addresses);
    }

    public void getStudentDataFromAddress() {
        Addresses addresses = addressRepository.findById(1).get();
        System.out.println(addresses);
        Student student = addresses.getStudent();
        System.out.println(student );
    }


    public void getStudentDataFromAddress1() {
        System.out.println("*********************");
        Addresses addresses = addressRepository.findById(1).get();
        System.out.println(addresses);
        System.out.println("######################");
    }


}
