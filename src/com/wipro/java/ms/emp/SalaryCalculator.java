package com.wipro.java.ms.emp;

class SalaryCalculator {
    public double calculateAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
    }
}