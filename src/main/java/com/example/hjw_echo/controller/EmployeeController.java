package com.example.hjw_echo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hjw_echo.controller.request.EmployeeUpdateRequest;
import com.example.hjw_echo.domain.Employee;
import com.example.hjw_echo.repository.EmployeeRepository;
import com.example.hjw_echo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	private final EmployeeRepository employeeRepository;
	private final EmployeeService employeeService;

	public EmployeeController(EmployeeRepository employeeRepository, EmployeeService employeeService) {
		this.employeeRepository = employeeRepository;
		this.employeeService = employeeService;
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee foundedEmployee = employeeRepository.findById(id);

		return ResponseEntity.ok().body(foundedEmployee);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Void> updateEmployeeById(@PathVariable Long id, @RequestBody EmployeeUpdateRequest request) {
		employeeService.updateEmployee(id,request);
		return ResponseEntity.noContent().build();
	}
}
