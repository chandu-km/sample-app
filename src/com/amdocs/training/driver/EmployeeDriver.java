package com.amdocs.training.driver;

import java.util.List;

import com.amdocs.training.dao.EmployeeDAO;
import com.amdocs.training.dao.impl.EmployeeDAOImpl;
import com.amdocs.training.model.Employee;

public class EmployeeDriver {

	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAOImpl();

//		List<Employee> list = employeeDAO.findAll();
//
//		list.forEach(System.out::println);

//		Employee employee = employeeDAO.getById(102);
//
//		System.out.println(employee);

//		Employee emp = new Employee(103, "Prabhat", 24, 4567890987l, 65000);
//
//		if (employeeDAO.addEmployee(emp)) {
//			System.out.println("Employee Added Successfully!");
//		} else {
//			System.out.println("Some error---Try Again!");
//		}
//		
//		List<Employee> list = employeeDAO.findAll();
//
//		list.forEach(System.out::println);

		// Delete Operation
		// 1.1 Get the Employee By Id
//
//		Employee emp = employeeDAO.getById(102);
//		boolean status = employeeDAO.deleteEmployee(emp);
//		if (status)
//			System.out.println("Employee Deleted Successfully!");
//		else
//			System.out.println("Employee Does not Exists");

		Employee emp = employeeDAO.getById(102);
		emp.setAge(emp.getAge() + 1);
		emp.setSalary(emp.getSalary() + emp.getSalary() * 10 / 100);

		if (employeeDAO.updateEmployee(emp)) {
			System.out.println("Employee Updated Successfully");
		} else {
			System.out.println("Employee does not exists");
		}

		List<Employee> list = employeeDAO.findAll();

		list.forEach(System.out::println);
	}

}
