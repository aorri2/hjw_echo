package com.example.hjw_echo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hjw_echo.domain.Department;
import com.example.hjw_echo.repository.DepartmentRepository;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {
	private final DepartmentRepository departmentRepository;

	public DepartmentController(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@GetMapping("/departments")
	public ResponseEntity<List<Department>> getAllDepartmentsWithLocations() {
		List<Department> departmentsWithLocations = departmentRepository.findAllDepartmentsWithLocations();
		return ResponseEntity.ok().body(departmentsWithLocations);
	}
}
