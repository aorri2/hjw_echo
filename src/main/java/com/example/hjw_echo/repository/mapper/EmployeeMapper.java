package com.example.hjw_echo.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.hjw_echo.domain.Employee;

@Mapper
public interface EmployeeMapper {

	@Select("select first_name,last_name,email,phone_number,hire_date,salary,commission_pct from employees where employee_id = #{id}")
	Employee findById(Long id);
}
