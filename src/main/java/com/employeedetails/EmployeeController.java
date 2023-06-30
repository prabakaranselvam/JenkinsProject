package com.employeedetails;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/get")
	public Map<String,Object>getStudentDetails(){
		Map<String,Object>response = new HashMap<>();
		response.put("name","Aravind");
		response.put("age",22);
		response.put("designation","developer");
		return response;
	}

}
