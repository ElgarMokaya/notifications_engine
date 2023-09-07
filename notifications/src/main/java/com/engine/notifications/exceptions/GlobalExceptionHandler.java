package com.engine.notifications.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	public ResponseEntity<String> handleCustomException(CustomException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<String> handleOtherExceptions(Exception ex){
		return new ResponseEntity<>("An unexpected error occured.",HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
