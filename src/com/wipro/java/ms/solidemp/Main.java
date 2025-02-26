package com.wipro.java.ms.solidemp;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        Employee manager = new Manager("Ramesh", 80000);
        Employee developer1 = new Developer("Suresh", 60000);
        Employee developer2 = new Developer("Harish", 60000);
        Employee securityGuard = new SecurityGuard("Ratheesh", 40000);

        ems.addEmployee(manager);
        ems.addEmployee(developer1);
        ems.addEmployee(developer2);
        ems.addEmployee(securityGuard);

        ems.showAllEmployees();
    }
}
