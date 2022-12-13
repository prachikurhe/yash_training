package com.example.nikhil.exception;

import java.time.LocalDateTime;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.nikhil.payloads.ErrorInfo;

@RestControllerAdvice
public class MyGlobalExceptionHandler {
   
	 @ExceptionHandler(ResourceNotFoundException.class)
	 public ResponseEntity<ErrorInfo> handleResourceNotFoundException(ResourceNotFoundException ex){
		 ErrorInfo error = new ErrorInfo();
		 error.setMessage(ex.getMessage());
		 error.setErrorCode(HttpStatus.NOT_FOUND.value());
		 error.setTimestamp(LocalDateTime.now());
		 return new ResponseEntity<ErrorInfo>(error , HttpStatus.NOT_FOUND);
		 
		 
	 }
	 
	 @ExceptionHandler(MethodArgumentNotValidException.class)
	 public ResponseEntity<Map<String , String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
		   Map<String , String> m1 = new HashMap<String, String>();
		   ex.getBindingResult().getAllErrors()
		                     .stream()
		                     .forEach(error->{
		                    	 String message=error.getDefaultMessage();
		                    	 String Field= ((FieldError)error).getField();
		                    	 m1.put(Field, message);
		                     });
		   return new ResponseEntity<Map<String,String>>(m1 , HttpStatus.BAD_REQUEST);
		 
		 
	 }
}
