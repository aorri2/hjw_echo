package com.example.hjw_echo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.hjw_echo.domain.Department;
import com.example.hjw_echo.repository.mapper.DepartmentMapper;

@Repository
public class DefaultDepartmentRepository implements DepartmentRepository {
	private final DepartmentMapper mapper;

	public DefaultDepartmentRepository(DepartmentMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public List<Department> findAllDepartmentsWithLocations() {
		return mapper.getAllDepartmentsWithLocations();
	}
}
