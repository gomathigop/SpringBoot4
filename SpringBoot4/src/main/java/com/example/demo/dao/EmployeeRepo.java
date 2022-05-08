package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository <Employee,Integer> {

}

