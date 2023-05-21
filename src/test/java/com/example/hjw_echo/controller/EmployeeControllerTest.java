package com.example.hjw_echo.controller;

import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.hjw_echo.repository.EmployeeRepository;

@WebMvcTest
class EmployeeControllerTest {


	@Autowired
	MockMvc mockMvc;


	@MockBean
	private EmployeeRepository employeeRepository;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	@DisplayName("employeeControllerTest")
	void getEmployeeIdTest() throws Exception {

		given(employeeRepository.findById(1L)).willReturn(any());

		mockMvc.perform(get("/api/v1/employees/1"))
			.andDo(print())
			.andExpect(status().isOk());
	}



}