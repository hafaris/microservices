package com.wipro.java.ms.solidemp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showAllEmployees() {
        for (Employee e : employees) {
            System.out.println("Employee: " + e.getName() + ", Salary: " + e.getSalary());
            e.work();
            System.out.println("-----------------------------");
        }
    }
}
