package com.wipro.java.ms.solidemp;

public class Developer implements Employee {
    private String name;
    private double salary;

    public Developer(String name, double salary) {
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
        System.out.println(name + " is writing code.");
    }

    public void developSoftware() {
        System.out.println(name + " is developing a new feature.");
    }
}
