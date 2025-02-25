package com.wipro.java.ms.solidemp;

public class SecurityGuard implements Employee {
    private String name;
    private double salary;

    public SecurityGuard(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is monitoring security.");
    }

    public void checkVisitors() {
        System.out.println(name + " is checking visitors at the gate.");
    }
}

