package com.sample.app.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.app.model.ExceptionModel;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResponseEntity<ExceptionModel> exception(HttpServletRequest request, Throwable t) {
		final ExceptionModel exception = new ExceptionModel(t.getMessage());
		return new ResponseEntity<ExceptionModel>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
