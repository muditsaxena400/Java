package com.cg.eis.pl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
//port com.model.ekart.Product;

public class MainController {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
	private static EmployeeServiceImpl employService;
	
	public MainController() {
		if(null==employService) {
			employService=new EmployeeServiceImpl();
		}
	}
	
	void operation() {
		Scanner sc=new Scanner(System.in);
		boolean status=true;
		while(status) {
		System.out.println("enter your choice:\n1.add employee\n2.for finding the insurance\n3.View list\n 4.exit");
		try {
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter id,name,salary");
			int id=sc.nextInt();
			String name=sc.next();
			float salary=sc.nextFloat();
			
			Employee e=new Employee();
			e.setId(id);
			e.setName(name);
			e.setSalary(salary);
			
			if(employService.addEmploy(e)) {
				System.out.println("employee added successfully");
			}
			else
				System.out.println("couldn't add employee");
			
		break;
		
		case 2:
			System.out.println("enter salary to check for insurance scheme:");
			float sal=sc.nextFloat();
			System.out.println("enter employ id to check for scheme");
			int employId=sc.nextInt();
		
			if(sal>5000 && sal<20000) {
				Employee emp=employService.getScheme(employId);
				emp.setId(employId);
				emp.setInsuranceScheme("C");
				emp.setDesignation("System associate");
				System.out.println(emp);
				break;
			}
			
			else if(sal>=20000 && sal<40000) {
				Employee emp=employService.getScheme(employId);
				emp.setId(employId);
				emp.setInsuranceScheme("B");
				emp.setDesignation("Programmer");
				System.out.println(emp);
				break;
				}
			
			else if(sal>=40000) {
				Employee emp=employService.getScheme(employId);
				emp.setId(employId);
				emp.setInsuranceScheme("A");
				emp.setDesignation("Manager");
				System.out.println(emp);
				break;
			}
			
			else if(sal<5000) {
				Employee emp=employService.getScheme(employId);
				emp.setId(employId);
				emp.setDesignation("clerk");
				System.out.println(emp);
				break;
			}
				break;
				
		case 3:
			List<Employee> allEmployees= employService.getAllEmployees();
			

			for (Employee emp1:allEmployees) {
				System.out.println(emp1);
			}
			break;
			
		case 4:
			System.out.println("Exiting from system...\n ThankYou!!");
			status=false;
			break;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
			
	}
	
	
	public static void main(String[] args) {
		
MainController ob=new MainController();
ob.operation();
	}

}
