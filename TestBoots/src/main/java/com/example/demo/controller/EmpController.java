package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.model.EmpModel;
import com.example.demo.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	public void addDataController(EmpModel model) {
		service.addData(model);
	}

	public void getData(EmpModel model) {
		service.addData(model);
	}
	
	public void getNo(int empno) {
		service.getNo(empno);
	}
	
	public void UpdateNo(EmpModel model) {
		service.UpdateNo(model);
	}
	
	public void DeleteNo(int empno) {
		service.DeleteNo(empno);
	}
	

}
