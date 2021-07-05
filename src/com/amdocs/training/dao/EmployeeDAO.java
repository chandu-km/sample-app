package com.amdocs.training.dao;

import java.util.List;

import com.amdocs.training.model.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();

	public Employee getById(int id);

	public boolean addEmployee(Employee employee);

	public boolean deleteEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);
	

}
