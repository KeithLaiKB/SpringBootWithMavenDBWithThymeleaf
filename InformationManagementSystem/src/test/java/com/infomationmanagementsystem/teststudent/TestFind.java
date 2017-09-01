/*package com.infomationmanagementsystem.teststudent;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import com.infomationmanagementsystem.model.Student;
import com.infomationmanagementsystem.myrepository.StudentRepository;
import com.mysql.jdbc.Connection;

public class TestFind  
{  
  
    private static SqlSessionFactory sqlSessionFactory;  
  
    @BeforeClass  
    public static void setUp() throws Exception  
    {  
        // create a SqlSessionFactory  
        Reader reader = Resources.getResourceAsReader("mybatis-mapper/StudentDaoInterfaceMapper.xml");  
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);  
        reader.close();  
  
        // populate in-memory database  
        SqlSession session = sqlSessionFactory.openSession();  
        Connection conn = (Connection) session.getConnection();  
        reader = Resources.getResourceAsReader("config/mybatis/files/hqlbd.sql");  
        ScriptRunner runner = new ScriptRunner(conn);  
        runner.setLogWriter(null);  
        runner.runScript(reader);  
        reader.close();  
        session.close();  
    }  
  
    @Test  
    public void shouldGetAUser()  
    {  
        SqlSession sqlSession = sqlSessionFactory.openSession();  
        try  
        {  
        	//StudentDaoInterface stuDaoInterface1;
        	StudentRepository studentRepository1 = sqlSession.getMapper(StudentRepository.class);  
            List<Student> stuList = studentRepository1.findAllStudents();  
            Assert.assertEquals("Student", stuList.get(0).getStuName());  
        } finally  
        {  
            sqlSession.close();  
        }  
    }  
  
}  */