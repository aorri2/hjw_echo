package com.example.hjw_echo.repository;

import org.springframework.stereotype.Repository;

import com.example.hjw_echo.repository.mapper.SalaryMapper;

@Repository
public class DefaultSalaryRepository implements SalaryRepository {

	private final SalaryMapper salaryMapper;

	public DefaultSalaryRepository(SalaryMapper salaryMapper) {
		this.salaryMapper = salaryMapper;
	}

	@Override
	public void increaseSalaryByPercentage(Long id, double increasePercentage) {
		salaryMapper.increaseSalaryByPercentage(id, increasePercentage);
	}
}
