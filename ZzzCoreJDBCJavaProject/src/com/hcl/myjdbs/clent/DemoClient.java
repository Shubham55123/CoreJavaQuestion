package com.hcl.myjdbs.clent;

import java.sql.SQLException;
import java.util.Optional;

import com.hcl.myjdbs.exception.EmployeeException;
import com.hcl.myjdbs.model.Employee;

public class DemoClient {
	
	public static void main(String[] args) {
		
		DemoClient demoJDBCProject = new DemoClient();
		//demoJDBCProject.createDatabaseTable();
		//demoJDBCProject.insertDatabaseTable();
		//demoJDBCProject.updateDatabaseTable();
		//demoJDBCProject.deleteDatabaseTable();
		demoJDBCProject.fetchRecords();
		
		try {
			
			//This 1st Approach.
			
			  Optional<Employee> employeeOptional =
			  demoJDBCProject.getEmployeeRecords("C001"); Employee employee =
			  employeeOptional.orElseThrow(()->new EmployeeException());
			   System.out.println(employee);
			 
			
			
//			  Optional<Employee> employeeOptional =
//			  demoJDBCProject.getEmployeeRecords("C001"); if(employeeOptional.isPresent())
//			  { Employee employee = employeeOptional.get(); System.out.println(employee); }
//			 
			
			Employee employee = new Employee();
			employee.setEmployeeId("ATEST");
			employee.setEmployeeName("TESTING");
			
			Optional<Employee> employeeOptional = demoJDBCProject.getEmployeeRecords("C001");
			Employee employeeObj = employeeOptional.orElse(employee);
			System.out.println(employeeObj);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

