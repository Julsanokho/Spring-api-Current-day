package com.saraya.restapiwebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.restapiwebApp.entity.Employer;

public interface EmployerRepository extends 
JpaRepository<Employer, Long>{

}
