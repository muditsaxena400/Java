package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
//import com.model.ekart.Product;

public interface IEmployeeService {

	Employee getScheme(int employId);
	
	boolean addEmploy(Employee employee);
	
	boolean Update(Employee employee);
	
	List <Employee> getAllEmployees();
}
