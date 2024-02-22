package com.example.cache.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cache.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}