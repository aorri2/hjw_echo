package com.example.hjw_echo.domain;

public class Department {
	private Long departmentId;
	private String departmentName;
	private Long managerId;
	private Location location;

	protected Department() {
	}

	public Department(Long departmentId, String departmentName, Long managerId, Location location) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
		this.location = location;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public Long getManagerId() {
		return managerId;
	}

	public Location getLocation() {
		return location;
	}
}
