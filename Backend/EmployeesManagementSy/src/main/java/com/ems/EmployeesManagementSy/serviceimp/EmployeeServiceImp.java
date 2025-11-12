package com.ems.EmployeesManagementSy.serviceimp;

import com.ems.EmployeesManagementSy.model.Employee;
import com.ems.EmployeesManagementSy.repository.EmployeeRepository;
import com.ems.EmployeesManagementSy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository ;


    public String addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
        return "Added Successfully";
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }

    public String updateEmployee(Long id,Employee employee){
        employeeRepository.updateEmployee(id,employee);
        return "Update Successfully";
    }

    public Employee getEmployeeById(Long id) {

      return   employeeRepository.getEmployeeById(id);


    }

    @Override
    public String deleteEmployeeById(Long id) {

        return employeeRepository.deleteEmployeeById(id);
    }
}
