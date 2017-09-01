package com.infomationmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 项目启动类
 * @author zzp 2017.04.05
 * @version 1.0
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MyStartApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MyStartApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyStartApplication.class, args);
	}

}
