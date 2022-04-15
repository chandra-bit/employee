package com.employee.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class EmployeeController {
	
	@GetMapping("/")
	
	public String employee() {
		return" employee";
	}
	@GetMapping("/addemp")
	public String addEmp() {
		return "add emp";
	}
	@PostMapping
	public String empRegister(@ModelAttribute EmployeeData e) {
		System.out.println(e);
		return "";
	}

}
