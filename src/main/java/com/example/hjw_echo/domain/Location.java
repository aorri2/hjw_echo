package com.example.hjw_echo.domain;

public class Location {
	private Long locationId;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	private String countryId;

	protected Location() {
	}

	public Location(Long locationId, String streetAddress, String postalCode, String city, String stateProvince,
		String countryId) {
		this.locationId = locationId;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.countryId = countryId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public String getCountryId() {
		return countryId;
	}
}
