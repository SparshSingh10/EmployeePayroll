package com.example.EmployeePayrollApp.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="employees")

public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank(message = "Name should not be empty")
        private String name;

        @Min(value = 10000, message = "Salary should be greater than 0")
        private double salary;

        @NotBlank(message = "Department should not be empty")
        private String department;

    public Employee() {}

        public Employee(String name,double salary,String department){
            this.name=name;
            this.salary=salary;
            this.department=department;
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

