package com.sh;

public class Main {
    public static void main(String[] args) {

        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);

        System.out.println("base salary: "+employee.getBaseSalary());
        System.out.println("hourly rate: "+employee.getHourlyRate());

        int wage = employee.calculateWage(10);
        System.out.println("Wage: "+wage);
    }
}
