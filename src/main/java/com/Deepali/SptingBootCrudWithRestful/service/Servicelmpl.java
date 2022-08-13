package com.Deepali.SptingBootCrudWithRestful.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Deepali.SptingBootCrudWithRestful.model.Employee;

@Service
public class Servicelmpl implements Servicel {

	@Override
	public int SaveEmployee(Employee employee) {
		
		return 0;
	}

	@Override
	public List<Employee> getallEmployee(Employee employee) {
		
		return null;
	}

}
