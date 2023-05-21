package com.example.hjw_echo.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.hjw_echo.domain.JobHistory;

@Mapper
public interface JobHistoryMapper {

	@Select("select * from job_history where employee_id = #{id}")
	JobHistory findById(Long id);
}
