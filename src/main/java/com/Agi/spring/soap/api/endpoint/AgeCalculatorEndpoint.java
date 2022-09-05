package com.Agi.spring.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.raaidrizvi.spring.soap.api.agecalculator.CustomerRequest;
import com.raaidrizvi.spring.soap.api.agecalculator.CustomerResponse;
import com.raaidrizvi.spring.soap.api.service.AgeCalculatorService;

@Endpoint
public class AgeCalculatorEndpoint {
	private static final String NAMESPACE="http://www.Agi.com/spring/soap/api/ageCalculator";
	@Autowired
	private AgeCalculatorService service;
	
	@PayloadRoot(namespace = NAMESPACE,localPart="CustomerRequest")
	@ResponsePayload
	public CustomerResponse getAgeDay(@RequestPayload CustomerRequest request) {
		return service.checkAge(request);
	}
}
