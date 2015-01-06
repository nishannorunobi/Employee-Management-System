package com.nishan.ems.dao;

import java.util.List;

import com.nishan.ems.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployee(String employeeId);
	public void editEmployee(Employee employee);
	public void deleteEmployee(String employeeId);
}
