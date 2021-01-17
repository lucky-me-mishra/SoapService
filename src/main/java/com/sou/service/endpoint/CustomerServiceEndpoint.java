package com.sou.service.endpoint;

import java.math.BigInteger;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soubhagya.spring.ws.v1.CreateCustomerRequest;
import com.soubhagya.spring.ws.v1.CreateCustomerResponse;

//http://localhost:8080/ws/customer.wsdl
@Endpoint
public class CustomerServiceEndpoint {

	@ResponsePayload
	@PayloadRoot(localPart="createCustomerRequest", namespace="http://spring.soubhagya.com/ws/v1")
	public CreateCustomerResponse createCustomer( @RequestPayload CreateCustomerRequest request) {
		
		CreateCustomerResponse response = new CreateCustomerResponse();
		response.setCustomerID(BigInteger.ONE);
		response.setDetails(request.getCustomerName() + " " + request.getCustomerCity() + " " + request.getCustomerPhoneNumber());
		response.setStatus("SUCCESS");
		return response;
	}

}