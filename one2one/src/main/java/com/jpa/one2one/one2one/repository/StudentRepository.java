package com.jpa.one2one.one2one.repository;

import com.jpa.one2one.one2one.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer > {
}
