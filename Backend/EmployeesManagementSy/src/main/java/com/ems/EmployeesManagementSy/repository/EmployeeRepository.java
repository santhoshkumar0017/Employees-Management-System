package com.ems.EmployeesManagementSy.repository;

import com.ems.EmployeesManagementSy.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addEmployee(Employee employee){
        String sql="insert into employees (employee_name,email,phone_number,role,hire_date,salary) values (?,?,?,?,?,?) ";
         jdbcTemplate.update(sql,employee.getEmployeeName(),employee.getEmail(),
                employee.getPhoneNumber(),employee.getRole(),employee.getHireDate(),employee.getSalary());
    }

    public List<Employee> getAllEmployees(){
        String sql="select * from employees";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Employee.class));
    }

    public void updateEmployee(Long id, Employee employee) {
        String sql="update employees set employee_name=?, email=? , phone_number=? , role=? , hire_date =? , salary=? where id="+id;

        jdbcTemplate.update(sql,employee.getEmployeeName(),employee.getEmail(),
                employee.getPhoneNumber(),employee.getRole(),employee.getHireDate(),employee.getSalary());

    }

    public Employee getEmployeeById(Long id) {
        String sql = "select * from employees where id="+id;
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class));
    }

    public String deleteEmployeeById(Long id) {
        String sql="delete from employees where id="+id;
        jdbcTemplate.update(sql);
        return "Deleted successfully";
    }
}
