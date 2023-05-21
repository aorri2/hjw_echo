package com.example.hjw_echo.repository;

import com.example.hjw_echo.domain.JobHistory;

public interface JobHistoryRepository {
	JobHistory findById(Long id);
}
