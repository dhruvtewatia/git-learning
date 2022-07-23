package com.lr.employee.junit.testcase;

import static org.junit.jupiter.api.Assertions.*;

import com.lr.trainong.employee.model.Employee;
import com.lr.trainong.employee.service.impl.EmployeeLocalServiceImpl;
import com.lr.trainong.employee.service.EmployeeService;

import org.junit.jupiter.api.Test;
import org.osgi.service.component.annotations.Reference;

class EmployeeTestCase {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	
	@Test
	public void testAddEmployee() {
		//String name,String address,long salary,String phoneNo,String emailAddress
		Employee emp = null;
		emp.setName("Dhruv Tewatia");
		emp.setAddress("Noida, India");
		emp.setSalary(50000000);
		emp.setPhoneNo("573785389");
		emp.setEmailAddress("dhruv.tewatia@infoaxon.com");
		
		assertEquals(_employeeService.addEmployeeDetails("Dhruv Tewatia","Noida, India",50000,"573785389","dhruv.tewatia@infoxon.com" ), emp);
	}

	private EmployeeService _employeeService;
	
	@Reference(unbind = "-")
	protected void setEmployeeService(EmployeeService employeeService) {
		
		_employeeService = employeeService;
		
	}
	
	

}

