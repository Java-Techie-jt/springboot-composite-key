package com.javatechie.key.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
/*@IdClass(EmployeePKId.class)*/
public class Employee {
    @EmbeddedId
    private EmployeePKId employeePKId;
    private String name;
    private String email;
    private String phone;
}
