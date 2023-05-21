package com.example.hjw_echo.controller.request;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeUpdateRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate hireDate;
	private BigDecimal salary;
	private BigDecimal commissionPct;

	public EmployeeUpdateRequest( String firstName, String lastName, String email, String phoneNumber,
		LocalDate hireDate, BigDecimal salary, BigDecimal commissionPct) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commissionPct = commissionPct;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public BigDecimal getCommissionPct() {
		return commissionPct;
	}

}
