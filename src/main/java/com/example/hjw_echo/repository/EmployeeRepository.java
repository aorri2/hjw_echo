package com.example.hjw_echo.repository;

import com.example.hjw_echo.domain.Employee;

public interface EmployeeRepository {

	Employee findById(Long id);
}
