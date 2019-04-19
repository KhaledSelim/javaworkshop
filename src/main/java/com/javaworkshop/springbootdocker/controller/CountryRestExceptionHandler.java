package com.javaworkshop.springbootdocker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CountryRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<CountryErrorResponse> handleException(CountryCodeNotFoundExecption exc) {
		CountryErrorResponse error = new CountryErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

	}
}
