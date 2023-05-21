package com.example.hjw_echo.repository;

import org.springframework.stereotype.Repository;

import com.example.hjw_echo.domain.Employee;
import com.example.hjw_echo.repository.mapper.EmployeeMapper;

@Repository
public class DefaultEmployeeRepository implements EmployeeRepository {

	private final EmployeeMapper employeeMapper;

	public DefaultEmployeeRepository(EmployeeMapper employeeMapper) {
		this.employeeMapper = employeeMapper;
	}

	@Override
	public Employee findById(Long id) {
		return employeeMapper.findById(id);
	}

	@Override
	public void updateEmployee(Long employeeId, Employee updatedEmployee) {
		employeeMapper.updateEmployee(employeeId,updatedEmployee);
	}
}
