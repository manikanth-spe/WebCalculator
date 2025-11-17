package com.example.demo.controller;

import java.net.http.HttpRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebCalculatorController {

	@GetMapping("cal/{a}/{b}")
	/*public String div(@RequestParam int a,@RequestParam int b) {
		int div;
		try {
		 div= a/b;}
		catch(ArithmeticException e ) {
			return "invalid input"; 
		}
		return "div= "+div;
	
	}*/
	ResponseEntity div(@PathVariable int a,@PathVariable int b) {
		int div;
		try {
			div=a/b;
			return new ResponseEntity(div, HttpStatus.OK);
		}
		catch (Exception e) {
			return new 	ResponseEntity("not valid",HttpStatus.BAD_REQUEST);
		}
		
		}
	@GetMapping("message/{message}")
	String getMessage(@PathVariable String message) {
		
		return message;
		fsasdjvjslnfbdbfma
	}
	}

