package com.jpa.one2one.one2one.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String name;
    private int mobile;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Addresses addresses;



    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    public Student() {
    }

    public Student(String name, int mobile) {
        this.name = name;
        this.mobile = mobile;
    }
}
