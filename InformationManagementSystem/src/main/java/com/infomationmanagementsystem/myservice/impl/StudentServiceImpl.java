package com.infomationmanagementsystem.myservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomationmanagementsystem.model.Student;
import com.infomationmanagementsystem.myrepository.StudentRepository;
import com.infomationmanagementsystem.myservice.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    @Autowired
    StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
	



	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findStudentById(id);
	}


	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAllStudents();
	}



}
