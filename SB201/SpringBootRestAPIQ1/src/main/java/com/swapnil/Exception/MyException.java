package com.swapnil.Exception;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MyException {
	
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyError> getEmployeeException(EmployeeException em,WebRequest req){
		
		MyError err=new MyError();
		err.setLocalt(LocalTime.now());
		err.setMsg(em.getMessage());
		err.setDescription(req.getDescription(false));
		
	return new ResponseEntity<MyError>(err, HttpStatus.BAD_REQUEST);	
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyError> mymnvfError(MethodArgumentNotValidException m){
		MyError err=new MyError();
		err.setLocalt(LocalTime.now());
		err.setMsg(m.getMessage());
		err.setDescription(m.getFieldError().getDefaultMessage());
		
		return new ResponseEntity<MyError>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyError> noException(NoHandlerFoundException noh,WebRequest req){
		
		MyError err=new MyError();
		err.setLocalt(LocalTime.now());
		err.setMsg(noh.getMessage());
		err.setDescription(req.getDescription(false));
		
	return new ResponseEntity<MyError>(err, HttpStatus.BAD_REQUEST);	
	}
	
	
	

}
