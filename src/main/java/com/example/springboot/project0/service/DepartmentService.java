package com.example.springboot.project0.service;
import java.util.List;

import  com.example.springboot.project0.entity.Department;

public interface DepartmentService {
	public Department saveDepartment(Department department);
	public List<Department> fetchDepartmentList();
	public Department fetchDepartmentById(Long departmentId);
	public void deleteDepartmentById(Long departmentId);
	public Department updateDepartment(Long departmentId, Department department);
	Department fetchDepartmentByName(String departmentName);

}
