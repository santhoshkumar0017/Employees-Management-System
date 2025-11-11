package com.ems.EmployeesManagementSy.controller;

import com.ems.EmployeesManagementSy.entity.Employee;
import com.ems.EmployeesManagementSy.serviceimp.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp employeeService;

  @PostMapping
    public String addEmployee(@RequestBody Employee employee){
      return employeeService.addEmployee(employee);
  }

  @GetMapping
    public List<Employee> getAllEmployees(){
      return employeeService.getAllEmployees();
  }

  @PutMapping("/{id}")
    public String updateEmployee(@PathVariable ("id" )Long id,@RequestBody Employee employee){
       return employeeService.updateEmployee(id,employee);

  }

  @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
      return  employeeService.getEmployeeById(id);
  }

}
