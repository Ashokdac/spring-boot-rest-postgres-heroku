package com.ashokdac.heroku.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokdac.heroku.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
}
