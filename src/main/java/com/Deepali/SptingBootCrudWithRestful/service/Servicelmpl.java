package com.Deepali.SptingBootCrudWithRestful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Deepali.SptingBootCrudWithRestful.dao.EmployeeDaol;
import com.Deepali.SptingBootCrudWithRestful.model.Employee;

@Service
public class Servicelmpl implements Servicel {
     @Autowired
	private EmployeeDaol employeeDaol;
	
	
	@Override
	public int SaveEmployee(Employee employee) {
		int save = employeeDaol.saveEmployeeDaol(employee);
		return save;
	}

	@Override
	public List<Employee> getallEmployee(Employee employee) {
		List<Employee> allEmployeeDaol = employeeDaol.getAllEmployeeDaol();
		return allEmployeeDaol;
	}

}
