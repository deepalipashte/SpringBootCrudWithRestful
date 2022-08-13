package com.Deepali.SptingBootCrudWithRestful.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Deepali.SptingBootCrudWithRestful.model.Employee;
@Repository
public class EmployeeDaolmpl implements EmployeeDaol {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public int saveEmployeeDaol(Employee employee) {
		Session session = sf.openSession();
		session.beginTransaction();
		int id = (int) session.save(employee);
		session.getTransaction().commit();
		return id;
	}

	@Override
	public List<Employee> getAllEmployeeDaol() {
		Session session = sf.openSession();
		String hql="from Employee";
		Query query = session.createQuery(hql);
		List list = query.getResultList();
		return list;
	}

}
