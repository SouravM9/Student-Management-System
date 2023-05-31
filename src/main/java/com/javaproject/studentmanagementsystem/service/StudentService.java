package com.javaproject.studentmanagementsystem.service;

import java.util.List;

import com.javaproject.studentmanagementsystem.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student existingStudent);

	void deleteStudentById(Long id);
}
