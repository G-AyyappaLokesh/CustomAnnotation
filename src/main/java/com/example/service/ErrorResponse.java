package com.example.service;

import java.util.Date;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorResponse {

	private final Integer status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private final Date timestamp;
	private final String error;
	private final String message;
	private final String details;

	public ErrorResponse(String message, String details, HttpStatus status) {
		super();
		this.status = status.value();
		this.error = status.name();
		this.timestamp = new Date();
		this.message = message;
		this.details = details;
	}
	
	public ErrorResponse(String message, HttpStatus status) {
		super();
		this.status = status.value();
		this.error = status.name();
		this.timestamp = new Date();
		this.message = message;
		this.details = "NA";
	}

	public Integer getStatus() {
		return status;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getError() {
		return error;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	

}
