package com.example.hjw_echo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hjw_echo.controller.response.SearchDataResponse;
import com.example.hjw_echo.service.NaverLocalService;

@RestController
@RequestMapping("/api/v1/client")
public class NaverLocalDataController {

	private final NaverLocalService naverLocalService;

	public NaverLocalDataController(NaverLocalService naverLocalService) {
		this.naverLocalService = naverLocalService;
	}

	@GetMapping("/data")
	public ResponseEntity<SearchDataResponse> getLocalData(@RequestParam String keyword) {
		return ResponseEntity.ok().body(naverLocalService.getData(keyword));
	}
}
