package com.example.hjw_echo.repository;

import java.util.List;

import com.example.hjw_echo.domain.Department;

public interface DepartmentRepository {
	List<Department> findAllDepartmentsWithLocations();
}
