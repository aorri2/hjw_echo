package com.example.hjw_echo.exception;

public class NotExistEmployeeException extends RuntimeException {
	public NotExistEmployeeException() {
		super("존재하지 않는 사원 입니다.");
	}
}
