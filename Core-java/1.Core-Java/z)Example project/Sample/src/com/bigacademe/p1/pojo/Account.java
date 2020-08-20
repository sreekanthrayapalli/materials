package com.bigacademe.p1.pojo;

public class Account {
	
	private int accno;
	private int accname;
	private int bal;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getAccname() {
		return accname;
	}
	public void setAccname(int accname) {
		this.accname = accname;
	}
	/*public int getBal() {
		return bal;
	}*/
	/*public void setBal(int bal) {
		this.bal = bal;
	}*/
	
	public void deposit(int bal){
		if(bal > 0)
		this.bal = this.bal + bal;
	}
	

}
