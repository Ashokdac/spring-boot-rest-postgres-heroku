package com.ashokdac.heroku;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokdac.heroku.model.Employee;
import com.ashokdac.heroku.repository.EmployeeRepository;

@RestController
@RequestMapping("/ngf")
public class ApplicationController {

	Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);
	private EmployeeRepository repository;

	@Autowired
	public ApplicationController(EmployeeRepository repository) {
		LOGGER.info("Controller Initialize ....");
		this.repository = repository;
	}
	
	@GetMapping("/employees")
	@ResponseBody
	public List<Employee> findAll(){
		LOGGER.info("Request received for find all Employee records");
		return repository.findAll();
	}
	@PostMapping("/employee")
	public ResponseEntity<Employee> insert(@RequestBody Employee employee) {
		LOGGER.info("Request Received for create new record into employee table");
		repository.save(employee);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Optional<Employee>>  retrieveEmployee(@PathVariable("id") long id) {
		LOGGER.info("Request Received for fetching employee using  id : ",id);
		Optional<Employee> result = repository.findById(id);
		return new ResponseEntity<Optional<Employee>>(result,HttpStatus.OK);
	}
}
