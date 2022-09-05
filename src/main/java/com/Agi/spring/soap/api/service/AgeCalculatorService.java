package com.raaidrizvi.spring.soap.api.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import com.raaidrizvi.spring.soap.api.agecalculator.CustomerResponse;
import com.raaidrizvi.spring.soap.api.agecalculator.CustomerRequest;

@Service
public class AgeCalculatorService {
	
	public CustomerResponse checkAge (CustomerRequest request) {
		CustomerResponse response = new CustomerResponse();
		LocalDate birthdate = LocalDate.of(request.getYear(),request.getMonth(),request.getDay());
		LocalDate now = LocalDate.now();
		int years = Period.between(birthdate, now).getYears();
		response.setAge("you are "+years+" years old");
		return response;
		
	}

}
