package com.Deepali.SptingBootCrudWithRestful.dao;

import java.util.List;

import com.Deepali.SptingBootCrudWithRestful.model.Employee;

public interface EmployeeDaol {
	public int saveEmployeeDaol(Employee employee);
	
    public List<Employee> getAllEmployeeDaol();

}
