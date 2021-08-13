package com.example.service;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<AddressValidation, String> {

	List<String> address = Arrays.asList("Delhi", "Hyderabad");

	@Override
	public void initialize(AddressValidation constraintAnnotation) {

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return address.contains(value);
	}

}
