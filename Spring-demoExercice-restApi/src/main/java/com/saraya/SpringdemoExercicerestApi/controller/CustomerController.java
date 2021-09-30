package com.saraya.SpringdemoExercicerestApi.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class CustomerController {
	@GetMapping
	public String currentDay() {
		LocalDate currentDate = LocalDate.now();
	      DayOfWeek day = currentDate.getDayOfWeek();
	      String weekName = day.name();
	      
		return "Welcome to "+ weekName +" sale the "+currentDate;
	}
}
