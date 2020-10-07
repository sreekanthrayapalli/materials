package com.myc.javafeatures.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Employee{
	int empno;
	String ename;
	int sal;
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
	public Employee(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
}
public class StreamExample2 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("abc");
		l.add("xyz");
		l.add("abc2");
		l.add("xyz2");
		l.add("abc3");
		
		List<Integer> result = l.stream().map((s)->s.length()).collect(Collectors.toList());
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "abc", 5000));
		list.add(new Employee(2,"xyz",6000));
		list.add(new Employee(3,"pqr",7000));
		
		//List <Employee>    -->List<String>
		/*
		 * List result
		 * for(){
		 * result.add(e.getSal());
		 * }
		 */
		List<String> result2 = list.stream().map(e->e.getEname()).collect(Collectors.toList());
		
		List<Integer> result3 = list.stream().map(e->e.getSal()).collect(Collectors.toList());
		
		
		
	}

}
