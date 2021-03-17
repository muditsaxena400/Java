package com.cg.eis.dao;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface IEmployeeDao {

	void addEmployee(Employee employee);
	
	void Update(Employee employee);
	
	Employee getScheme(int employId);
	
	List<Employee> getAllEmployees();
}
