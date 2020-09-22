package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

class Employee{
	int empno;
	String ename;
	int sal;
	Employee(int empno,String ename,int sal){
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
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
}

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MyController {
	List<Employee> list = new ArrayList<>();
	 public MyController() {
			list.add(new Employee(1,"abc",5000));
			list.add(new Employee(2,"xyz",6000));
			list.add(new Employee(3,"pqr",7000));
	}
	 
	 
	@RequestMapping("getemps")
	public List<Employee> getEmployess(){
		return list;
	}
	
	
	@RequestMapping(value = "saveemp", method = RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee emp) {
		list.add(emp);
		//return "Employee got saved";
	}
}
