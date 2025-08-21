package com.jpa.one2many.one2many.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String name;
    private int mobile;


    public Student() {
    }

    public Student(String name, int mobile) {
        this.name = name;
        this.mobile = mobile;
    }



}
