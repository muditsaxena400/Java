package com.cg.eis.service;


import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDaoImpl;
import com.cg.eis.dao.IEmployeeDao;


public class EmployeeServiceImpl implements IEmployeeService {

	private static IEmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		if(null==employeeDao) {
			employeeDao=new EmployeeDaoImpl();
		}
	}
	
	@Override
	public boolean addEmploy(Employee employee) {
		employeeDao.addEmployee(employee);
		Employee savedEmploy = employeeDao.getScheme(employee.getId());

		if (savedEmploy != null)
			return true;
		else
			return false;

	}
	
	@Override
	public Employee getScheme(int employId) {
		return employeeDao.getScheme(employId);
		
	}

	
	
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public boolean Update(Employee employee) {
		employeeDao.Update(employee);
		Employee savedEmploy = employeeDao.getScheme((int) employee.getSalary());

		if (savedEmploy != null)
			return true;
		else
			return false;
	}
	

}
