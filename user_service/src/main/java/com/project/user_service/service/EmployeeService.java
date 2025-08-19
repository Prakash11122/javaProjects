package com.project.user_service.service;

import com.project.user_service.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
     public Employee getEmployeeById(Long id);
    public Employee createEmployee(Employee employee);
    public Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
