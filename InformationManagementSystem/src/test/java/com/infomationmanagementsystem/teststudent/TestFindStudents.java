/*package com.infomationmanagementsystem.teststudent;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.infomationmanagementsystem.MyStartApplication;
import com.infomationmanagementsystem.model.Student;
import com.infomationmanagementsystem.myrepository.StudentRepository;
//need input the junit jar from porm
//@RunWith(SpringRunner.class)
//need import import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
//need import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！ 

@SpringApplicationConfiguration(classes = MyStartApplication.class) // 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。

public class TestFindStudents {

	//自动装配
	@Resource
	StudentRepository studentRepository1;

	
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	public List<Student> findStudents()
	{
		
		//return stuDaoInterface1.findStudents();
		return new ArrayList<Student>();
	}
	
	
	@Test
	public void a()
	{
		int i=0;
		List<Student> stuList=stuDaoInterface1.findStudents();
		for(i=0;i<=stuList.size()-1;i++)
		{
			System.out.println(stuList.get(i).getStuName());
			
		}
		Student stu1=new Student();
		System.out.println("aa");
	}
	
	
	@Test
	public void testa()
	{
		//need import static org.assertj.core.api.Assertions.assertThat;
		String body = this.restTemplate.getForObject("/", String.class);
		assertThat(body).isEqualTo("Hello World");
		
	}
}
*/