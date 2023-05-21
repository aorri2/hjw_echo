package com.example.hjw_echo.domain;

import java.time.LocalDate;

public class JobHistory {
	private int employeeId;
	private LocalDate startDate;
	private LocalDate endDate;
	private String jobId;
	private int departmentId;

	public JobHistory(int employeeId, LocalDate startDate, LocalDate endDate, String jobId, int departmentId) {
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.jobId = jobId;
		this.departmentId = departmentId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public String getJobId() {
		return jobId;
	}

	public int getDepartmentId() {
		return departmentId;
	}
}
