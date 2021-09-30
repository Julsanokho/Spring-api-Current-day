package com.saraya.restapiwebApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.saraya.restapiwebApp.entity.Employer;
import com.saraya.restapiwebApp.repository.EmployerRepository;

@Configuration
public class Client {
	private static final Logger log = LoggerFactory.getLogger(Client.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiWebAppApplication.class, args);
	}
	  @Bean
	  CommandLineRunner initDatabase(EmployerRepository repository) {
       
	    return args -> {
	      log.info("Preloading " + repository.save(new Employer("Souleymane Sanokho", "Developper")));
	      log.info("Preloading " + repository.save(new Employer("Aly Gueuye", "Comercial")));
	    };
	  }
	

}
