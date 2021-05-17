package com.example.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;
import com.example.demo.component.EmployeeBean;
import com.example.demo.controller.HelloRestController;

@SpringBootApplication
public class HelloWorldApplication {
	
	public static void main(String[] args) {
	    Logger logger = Logger.getLogger(HelloWorldApplication.class.getName());
		logger.info("Welcome to Spring Concept Demo.");
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
//		logger.log(Level.INFO, "hello");
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.info("DemoBean = " + demoBean.toString());
		System.out.println(context.getBean(HelloRestController.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring FrameWork");
		employeeBean.showEmployeeDetails();
	}

}
