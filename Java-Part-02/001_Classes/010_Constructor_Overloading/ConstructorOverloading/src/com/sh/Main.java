package com.sh;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 10);
        var employee1 = new Employee(10_000);

        System.out.println("Employee: "+employee.calculateWage(10));
        System.out.println("Employee1: "+employee.calculateWage(0));
    }
}
