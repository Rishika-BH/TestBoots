package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.EmpController;
import com.example.demo.model.EmpModel;

@SpringBootApplication
public class TestBootsApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(TestBootsApplication.class, args);
		
		
		//TestApp ta = context.getBean(TestApp.class);
		//ta.m1();
	
		
		//Developer de = context.getBean(Developer.class);
		//de.code();
		
		EmpController empC = context.getBean(EmpController.class);
		//empC.addDataController(new EmpModel(101,"java",10000));
		//empC.addDataController(new EmpModel(102,"python",109887));
		
		
		
		
	}

}
