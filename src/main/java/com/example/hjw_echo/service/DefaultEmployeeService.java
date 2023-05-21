package com.example.hjw_echo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.hjw_echo.controller.request.EmployeeUpdateRequest;
import com.example.hjw_echo.domain.Employee;
import com.example.hjw_echo.exception.NotExistEmployeeException;
import com.example.hjw_echo.repository.EmployeeRepository;

@Service
public class DefaultEmployeeService implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	public DefaultEmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	@Transactional
	public void updateEmployee(Long employeeId, EmployeeUpdateRequest request) {
		Employee foundedEmployee = employeeRepository.findById(employeeId);

		if(foundedEmployee == null){
			throw new NotExistEmployeeException();
		}

		foundedEmployee.updateEmployee(request);

		employeeRepository.updateEmployee(employeeId,foundedEmployee);
	}
}
