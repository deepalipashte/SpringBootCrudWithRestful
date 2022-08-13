package com.Deepali.SptingBootCrudWithRestful.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	
	private String ename;
	
	private String esal;
	
	private String edep;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsal() {
		return esal;
	}

	public void setEsal(String esal) {
		this.esal = esal;
	}

	public String getEdep() {
		return edep;
	}

	public void setEdep(String edep) {
		this.edep = edep;
	}

	public Employee(int eid, String ename, String esal, String edep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edep = edep;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edep=" + edep + "]";
	}
	
	
	
	
	
	
	
	

}
