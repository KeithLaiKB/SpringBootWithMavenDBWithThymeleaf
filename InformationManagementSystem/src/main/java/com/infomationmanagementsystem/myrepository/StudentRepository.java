package com.infomationmanagementsystem.myrepository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.infomationmanagementsystem.model.Student;

/*
 * 接口 
 * 
 * mybatis-mapper中的 xml里面 会需要 找到  StudentDaoInterface
 * 
 * 
 *其实就相当于 dao 的interface  (studentDaoInterface)
 * 
 * */
@Mapper
public interface StudentRepository {
	public List<Student> findAllStudents();
	public Student findStudentById(int id);
}
