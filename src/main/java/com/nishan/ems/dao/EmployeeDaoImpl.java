package com.nishan.ems.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nishan.ems.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}

	public List<Employee> getAllEmployees() {
		List list = sessionFactory.getCurrentSession().createQuery("from employee").list();
		return list;
	}

	public Employee getEmployee(String employeeId) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().get(Employee.class,employeeId);
		return employee;
	}

	public void editEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
	}

	public void deleteEmployee(String employeeId) {
		sessionFactory.getCurrentSession().delete(getEmployee(employeeId));
	}

}
