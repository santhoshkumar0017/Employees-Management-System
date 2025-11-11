package com.ems.EmployeesManagementSy.service;

import com.ems.EmployeesManagementSy.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public String addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public String updateEmployee(Long id,Employee employee);
    public Employee getEmployeeById(Long id);

}
