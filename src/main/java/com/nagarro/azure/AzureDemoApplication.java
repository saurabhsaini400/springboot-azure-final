package com.nagarro.azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoApplication {

	@Autowired
	private	EmployeeRepo employeeRepo;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
	
		return employeeRepo.save(employee);
 	}
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return employeeRepo.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

}
