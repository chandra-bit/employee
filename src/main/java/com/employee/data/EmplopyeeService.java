package com.employee.data;

import org.springframework.beans.factory.annotation.Autowired;

public class EmplopyeeService {
	
	@Autowired
	private EmpRepo repo;
	public void addEmp(Employee e) {
		repo.save(e); 
	}
	


}
