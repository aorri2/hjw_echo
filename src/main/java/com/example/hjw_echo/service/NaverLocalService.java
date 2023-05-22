package com.example.hjw_echo.service;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.hjw_echo.controller.response.SearchDataResponse;

@Service
public class NaverLocalService {

	private final RestTemplate restTemplate;
	private final UriProcessorService uriProcessorService;

	public NaverLocalService(RestTemplate restTemplate, UriProcessorService uriProcessorService) {
		this.restTemplate = restTemplate;
		this.uriProcessorService = uriProcessorService;
	}

	public SearchDataResponse getData(String keyword) {

		URI uri = uriProcessorService.makeUri(keyword);

		RequestEntity<Void> requestEntity = RequestEntity
			.get(uri)
			.header("X-Naver-Client-Id","hHO0wcpnAXDLBI_eaKUo")
			.header("X-Naver-Client-Secret","0W9VBZz4gw")
			.build();

		ResponseEntity<SearchDataResponse> result = restTemplate.exchange(requestEntity, SearchDataResponse.class);

		return result.getBody();
	}

}
