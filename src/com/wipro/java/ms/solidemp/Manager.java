package com.wipro.java.ms.solidemp;

public class Manager implements Employee {
    private String name;
    private double salary;

    public Manager(String name, double salary) {
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
        System.out.println(name + " is managing the team.");
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}
