package com.example.hjw_echo.service;

import com.example.hjw_echo.controller.request.EmployeeUpdateRequest;

public interface EmployeeService {
	void updateEmployee(Long employeeId, EmployeeUpdateRequest request);
}
