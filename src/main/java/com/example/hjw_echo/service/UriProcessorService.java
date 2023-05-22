package com.example.hjw_echo.service;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UriProcessorService {

	private static final String BASE_URL = "https://openapi.naver.com";
	private static final String PATH = "/v1/search/local.json";

	public URI makeUri(String keyword) {
		return UriComponentsBuilder
			.fromUriString(BASE_URL)
			.path(PATH)
			.queryParam("query", keyword)
			.queryParam("display",10)
			.queryParam("start",1)
			.queryParam("sort","random")
			.encode()
			.build()
			.toUri();
	}
}
