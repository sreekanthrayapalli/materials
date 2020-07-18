package com.myc.collections;

public class Employee implements Comparable<Employee>{

	private String ename;
	private int  sal;
	private int empno;
	
	public Employee(int empno,String ename,int sal){
		this.ename = ename;
		this.empno = empno;
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
	
	@Override
	public int compareTo(Employee arg0) {
		//return this.empno - arg0.getEmpno();
		
		/*//return this.ename.compareTo(arg0.getEname());
		return (this.empno-arg0.getEmpno())+this.ename.compareTo(arg0.getEname());
		
		
*/	
	int diff;	
	diff = this.empno - arg0.getEmpno();
	if(diff==0){
		diff = this.ename.compareTo(arg0.getEname());
	}
	return diff;
	}
	
	@Override
	public boolean equals(Object obj){
		boolean result = false;
		Employee emp = (Employee)obj;
		
		if(this.empno==emp.getEmpno()&&this.ename.equals(emp.getEname())&&this.sal==emp.getSal()){
			result = true;
		}
		
		return result;
	}
	
	public int hashCode(){
		return empno*1234;
	}
}
