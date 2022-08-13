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
<<<<<<< HEAD
		int id = employeeDaol.saveEmployeeDaol(employee);
		return id;
=======
		int save = employeeDaol.saveEmployeeDaol(employee);
		return save;
>>>>>>> e4a1953bcbf7e4566f01e6fc15520666c4f06d04
	}

	@Override
	public List<Employee> getallEmployee(Employee employee) {
<<<<<<< HEAD
		List<Employee> list = employeeDaol.getAllEmployeeDaol();
		return list;
=======
		List<Employee> allEmployeeDaol = employeeDaol.getAllEmployeeDaol();
		return allEmployeeDaol;
>>>>>>> e4a1953bcbf7e4566f01e6fc15520666c4f06d04
	}

}
