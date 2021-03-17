package com.cg.eis.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.Employee;

public  class EmployeeDaoImpl implements IEmployeeDao {
static Employee employee=new Employee();
private static Map<Integer,Employee> employees;
	
	public EmployeeDaoImpl() {
		if(null==employees) {
			employees=new HashMap<>();
		}
	}
	@Override
	public void addEmployee(Employee employee) {
		
		employees.put(employee.getId(), employee);
	}

	@Override
	public Employee getScheme(int employId) {
		//employees.put(employee.getDesignation(), employee.getInsuranceScheme());
		return employees.get(new Integer(employId));
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		ArrayList<Employee> list = new ArrayList<>();

		Collection<Employee> employeeList = employees.values();

		for (Employee c : employeeList) {
			list.add(c);
		}

		return list;
	}
	@Override
	public void Update(Employee employee) {
		employees.put(employee.getId(), employee);
		
	}

}
