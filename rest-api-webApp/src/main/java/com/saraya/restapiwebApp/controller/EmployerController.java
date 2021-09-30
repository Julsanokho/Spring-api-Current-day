package com.saraya.restapiwebApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.restapiwebApp.entity.Employer;
import com.saraya.restapiwebApp.model.EmployeeNotFoundException;
import com.saraya.restapiwebApp.repository.EmployerRepository;

@RestController
public class EmployerController {
	private final EmployerRepository repository;

	  EmployerController(EmployerRepository repository) {
	    this.repository = repository;
	  }


	  // Aggregate root
	  // tag::get-aggregate-root[]
	  @GetMapping("/employees")
	  List<Employer> all() {
	    return repository.findAll();
	  }
	  // end::get-aggregate-root[]

	  @PostMapping("/employees")
	  Employer newEmployee(@RequestBody Employer newEmployer) {
	    return repository.save(newEmployer);
	  }

	  // Single item
	  
	  @GetMapping("/employees/{id}")
	  Employer one(@PathVariable Long id) {
	    
	    return repository.findById(id)
	      .orElseThrow(() -> new EmployeeNotFoundException(id));
	  }

	  @PutMapping("/employees/{id}")
	  Employer replaceEmployee(@RequestBody Employer newEmployer, @PathVariable Long id) {
	    
	    return repository.findById(id)
	      .map(employee -> {
	        employee.setName(newEmployer.getName());
	        employee.setRole(newEmployer.getRole());
	        return repository.save(employee);
	      })
	      .orElseGet(() -> {
	        newEmployer.setId(id);
	        return repository.save(newEmployer);
	      });
	  }

	  @DeleteMapping("/employees/{id}")
	  void deleteEmployee(@PathVariable Long id) {
	    repository.deleteById(id);
	  }

}
