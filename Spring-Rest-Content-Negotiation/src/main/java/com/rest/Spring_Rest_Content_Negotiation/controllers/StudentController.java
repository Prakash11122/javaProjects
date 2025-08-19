package com.rest.Spring_Rest_Content_Negotiation.controllers;

import com.rest.Spring_Rest_Content_Negotiation.dto.Student;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RestController
public class StudentController {

    @GetMapping(value = "/student", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getStudentv1(){
        System.out.println("plain text method copy that");
        return new Student(1,"guna","guna@gmail.com").toString();
    }


    @GetMapping(value = "/student", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Student getStudentv2(){
        return new Student(1,"guna","guna@gmail.com");
    }

    @GetMapping(value = "/student", produces = MediaType.APPLICATION_PDF_VALUE)
    public InputStreamResource getStudentv4() throws FileNotFoundException {
        InputStreamResource ret = null;

        FileInputStream fileInputStream = new FileInputStream("/Users/prakashpradhan/Desktop/prakash.pdf");
        ret = new InputStreamResource(fileInputStream);
        return ret;
    }


/*    @GetMapping(value = "/student", produces = MediaType.APPLICATION_XML_VALUE)
    public Student getStudentv3(){
        System.out.println("xml method copy that");
        return new Student(1,"guna","guna@gmail.com");
    }*/


    @PostMapping(value = "/student",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    Student  CreateStudent(@RequestBody Student student){
        System.out.println(student);
        System.out.println("inside create student : Post method");
        return student;
    }





}
