package com.saraya.SpringdemorestApi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	//fetching the customer detail
	@GetMapping
	public String fechCustomer() {
		return "Customers fetched successfully";
	}
	
	// adding a new customer
	@PostMapping
	public String createCustomer() {
		return "Customer adding successfully";
	}
	
	//updating un existant customer
	@PutMapping
	public String updateCustomer() {
		return "Customer details updated successfully";
	}
	
	// deleting un existant customer
	@DeleteMapping
	public String deleteCustomer() {
		return "Customer detaails delete successfully";
	}

}
