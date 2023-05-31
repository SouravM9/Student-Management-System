package com.javaproject.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
