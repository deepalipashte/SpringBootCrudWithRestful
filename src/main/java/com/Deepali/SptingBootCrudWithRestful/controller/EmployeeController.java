package com.Deepali.SptingBootCrudWithRestful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Deepali.SptingBootCrudWithRestful.model.Employee;
import com.Deepali.SptingBootCrudWithRestful.service.Servicel;

@RestController
public class EmployeeController {
	@Autowired
   private Servicel servicel;
	
	@PostMapping(value="/save",consumes="application.json",produces="application.json")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		int id = servicel.SaveEmployee(employee);
		
		return new ResponseEntity<Employee>(HttpStatus.CREATED);
		
	}
	
	
	@GetMapping(value="/save",produces="application.json")
	public ResponseEntity<List<Employee>> getEmployee(@RequestBody Employee employee){
		
		 List<Employee> list = servicel.getallEmployee(employee);
		
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
		
	}
	
	
}
