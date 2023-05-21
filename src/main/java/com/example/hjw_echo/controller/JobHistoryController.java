package com.example.hjw_echo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hjw_echo.domain.JobHistory;
import com.example.hjw_echo.repository.JobHistoryRepository;

@RestController
@RequestMapping("/api/v1")
public class JobHistoryController {
	private final JobHistoryRepository jobHistoryRepository;

	public JobHistoryController(JobHistoryRepository jobHistoryRepository) {
		this.jobHistoryRepository = jobHistoryRepository;
	}

	@GetMapping("/employees/{id}/job-history")
	public ResponseEntity<JobHistory> getJobHistory(@PathVariable Long id) {
		JobHistory foundedJobHistory = jobHistoryRepository.findById(id);

		return ResponseEntity.ok().body(foundedJobHistory);
	}
}
