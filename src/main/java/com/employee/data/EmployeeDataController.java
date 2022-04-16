package com.employee.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("hiding")
@RestController
public class EmployeeDataController {

	@RequestMapping("/Employee")
	public List<EmployeeData> getAllEmplolyeeData() {
		return Arrays.asList(new EmployeeData("h500", "sesa", 4567), new EmployeeData("t500", "sekhar", 1200),
				new EmployeeData("y600", "chandra", 6000));
	}
}
