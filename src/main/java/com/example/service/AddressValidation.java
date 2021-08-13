package com.example.service;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AddressValidator.class)
@Target(ElementType.FIELD)
public @interface AddressValidation {
	

	String message() default "This is not valid Address";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
