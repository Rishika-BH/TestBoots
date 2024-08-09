package com.example.demo.model;

public class EmpModel {
	private int empno;
	private String  ename;
	private int sal;
	public EmpModel() {
		super();
		
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	@Override
	public String toString() {
		return "EmpModel [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

}
