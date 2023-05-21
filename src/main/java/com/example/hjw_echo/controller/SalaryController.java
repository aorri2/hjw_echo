package com.example.hjw_echo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hjw_echo.controller.request.SalaryIncreaseRequest;
import com.example.hjw_echo.repository.SalaryRepository;

@RestController
@RequestMapping("/api/v1")
public class SalaryController {

	private final SalaryRepository salaryRepository;

	public SalaryController(SalaryRepository salaryRepository) {
		this.salaryRepository = salaryRepository;
	}

	@PatchMapping("/salary")
	public ResponseEntity<Void> increaseSalary(@RequestBody SalaryIncreaseRequest salaryIncreaseRequest) {
		salaryRepository.increaseSalaryByPercentage(salaryIncreaseRequest.getDepartmentId(),salaryIncreaseRequest.getIncreasePercentage());
		return ResponseEntity.noContent().build();
	}
}
