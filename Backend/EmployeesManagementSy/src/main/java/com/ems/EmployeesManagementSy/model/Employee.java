package com.ems.EmployeesManagementSy.model;

import lombok.*;


import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    private Long id;
    private String employeeName;
    private String email;
    private String phoneNumber;
    private String role;
    private LocalDate hireDate;
    private Long salary;
}
