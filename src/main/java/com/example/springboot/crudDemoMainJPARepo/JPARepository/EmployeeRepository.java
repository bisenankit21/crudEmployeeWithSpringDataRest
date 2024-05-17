package com.example.springboot.crudDemoMainJPARepo.JPARepository;

import com.example.springboot.crudDemoMainJPARepo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "members")  using this annotation we can access all the endpoints usinf /localhost/magic-api/members
 public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
