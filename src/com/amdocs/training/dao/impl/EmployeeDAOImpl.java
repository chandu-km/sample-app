package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.training.dao.EmployeeDAO;
import com.amdocs.training.model.Employee;
import com.amdocs.training.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection conn = DBUtil.getConnection();

	private static  List<Employee> employees;

	static {
		employees = new ArrayList<>();

		employees.add(new Employee(101, "Anjali", 21, 9878676868L, 55000));
		employees.add(new Employee(102, "Manish", 23, 9087654567L, 65000));
	}

	@Override
	public List<Employee> findAll() {
		return employees;
	}

	@Override
	public Employee getById(int id) {
		for (Employee emp : employees) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		try {
			employees.add(employee);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		try {
			for (Employee emp : employees) {
				if (emp.getId() == employee.getId()) {
					employees.remove(emp);
					break;
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		for (Employee emp : employees) {
			if (emp.getId() == employee.getId()) {
//				emp.setName(employee.getName());
//				emp.setAge(employee.getAge());
//				emp.setPhoneNumber(employee.getPhoneNumber());
//				emp.setSalary(employee.getSalary());

				employees.set(employees.indexOf(emp), employee);
				return true;
			}
		}
		return false;
	}

}
