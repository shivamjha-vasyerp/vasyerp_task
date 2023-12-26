package com.example.task6.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.task6.dto.ResponseDto;
import com.example.task6.exception.CustomerNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseDto userNotFoundExceptionHandling(CustomerNotFoundException ex)
	{
		return new ResponseDto(500,"Error",ex.getMessage());
	}
}
