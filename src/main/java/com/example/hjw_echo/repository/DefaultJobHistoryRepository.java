package com.example.hjw_echo.repository;

import org.springframework.stereotype.Repository;

import com.example.hjw_echo.domain.JobHistory;
import com.example.hjw_echo.repository.mapper.JobHistoryMapper;

@Repository
public class DefaultJobHistoryRepository implements JobHistoryRepository {
	private final JobHistoryMapper mapper;

	public DefaultJobHistoryRepository(JobHistoryMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public JobHistory findById(Long id) {
		return mapper.findById(id);
	}
}
