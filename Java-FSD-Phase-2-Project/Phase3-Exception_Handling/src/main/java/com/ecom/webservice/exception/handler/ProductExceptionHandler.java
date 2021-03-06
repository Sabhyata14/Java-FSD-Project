package com.ecom.webservice.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ecom.webservice.exception.InvalidProductException;
import com.ecom.webservice.exception.ProductAlreadyExistException;
import com.ecom.webservice.exception.ProductNotFoundException;

@ControllerAdvice
public class ProductExceptionHandler {
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> notFoundException(ProductNotFoundException exception){
		return new ResponseEntity<Object>("Product Not Found !",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = InvalidProductException.class)
	public ResponseEntity<Object> invalidProduct(InvalidProductException exception){
		return new ResponseEntity<Object>("Invalid Product Data !!",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = ProductAlreadyExistException.class)
	public ResponseEntity<Object> alreadyExistsException(ProductAlreadyExistException exception){
		return new ResponseEntity<Object>("Product Already Exists !!!", HttpStatus.BAD_REQUEST);
	}
	

}
