package com.example.service;

public class AddressPojo {

	@AddressValidation
	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
