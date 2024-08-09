package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmpModel;
import com.example.demo.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo repo;
	

	public void addData(EmpModel model) {
		repo.add(model);
	}
	
	public void getNo(int empno) {
		repo.getByNo(empno);
	}
	
	public void UpdateNo(EmpModel model) {
		repo.updateByNo(model);
	}
	
	public void DeleteNo(int empno) {
		repo.deleteByNo(empno);
	}

}
