package com.example.hjw_echo.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.hjw_echo.domain.Department;

@Mapper
public interface DepartmentMapper {


	List<Department> getAllDepartmentsWithLocations();

}
