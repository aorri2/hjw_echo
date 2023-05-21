package com.example.hjw_echo.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SalaryMapper {

	@Update("update employees set salary = salary + (salary * #{increasePercentage}) where department_id = #{id}")
	void increaseSalaryByPercentage(Long id, double increasePercentage);
}
