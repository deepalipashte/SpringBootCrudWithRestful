package com.Deepali.SptingBootCrudWithRestful.service;

import java.util.List;

import com.Deepali.SptingBootCrudWithRestful.model.Employee;

public interface Servicel {
	
	
	public int SaveEmployee(Employee employee);
	public List<Employee> getallEmployee(Employee employee);
	

}
