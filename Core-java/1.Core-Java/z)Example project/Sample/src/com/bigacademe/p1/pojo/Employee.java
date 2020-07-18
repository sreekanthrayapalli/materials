package com.bigacademe.p1.pojo;

public class Employee {

	//variable
	private int empno;
	private String ename;
	private int sal;
	
	
	
	public Employee(int empno,String ename,int sal){
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno){
		if(empno > 0)
		this.empno = empno;
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
	
	
	//setters and getters method
	
	
	
}
