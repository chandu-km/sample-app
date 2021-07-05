package com.amdocs.training.model;

public class Employee {

	private int id;
	private String name;
	private int age;
	private long phoneNumber;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, long phoneNumber, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", salary="
				+ salary + "]";
	}

}
