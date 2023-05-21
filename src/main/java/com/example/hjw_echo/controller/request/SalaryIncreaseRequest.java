package com.example.hjw_echo.controller.request;

public class SalaryIncreaseRequest {
	private Long departmentId;
	private double increasePercentage;

	public SalaryIncreaseRequest(Long departmentId, double increasePercentage) {
		this.departmentId = departmentId;
		this.increasePercentage = increasePercentage;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public double getIncreasePercentage() {
		return increasePercentage;
	}
}
