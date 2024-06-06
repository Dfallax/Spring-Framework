package com.example.practica03.repository;

import com.example.practica03.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByFullName(String fullName);
    Optional<Employee> findByFullNameAndBirthDate(String fullName);
    

}
