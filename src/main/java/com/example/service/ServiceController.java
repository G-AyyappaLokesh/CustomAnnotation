package com.example.service;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "helloworld";
	}

	@RequestMapping(value = "/home1", method = RequestMethod.POST)
	public String home1(@Valid @RequestBody AddressPojo add) {
		return "helloworld";
	}

}
