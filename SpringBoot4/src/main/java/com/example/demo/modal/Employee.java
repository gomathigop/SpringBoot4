package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
private int eid;
private String ename;
private String eemail;


public Employee() {
	super();
}
public Employee(int eid, String ename,String eemail) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.eemail=eemail;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getename() {
	return ename;
}

public void setename(String ename) {
	this.ename = ename;
}
public String geteemail() {
	return eemail;
}

public void seteemail(String eemail) {
	this.eemail = eemail;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + "eemail=" + eemail +"]";
}



}



