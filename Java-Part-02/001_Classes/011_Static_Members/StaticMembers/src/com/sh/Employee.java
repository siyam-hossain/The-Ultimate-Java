package com.sh;

public class Employee {

    private int baseSalary;
    private int hourlyRate;

    /*
        1. The static keyword in Java indicates that a member (variable, method, block, or nested class) belongs to the class itself rather than to any specific instance (object) of that class.
        2. This means the member is loaded into memory only once when the class is loaded, allowing it to be accessed directly using the class name without creating an object
     */

    // static variable
    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);

        numberOfEmployees++;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary <=0 ){
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0 ){
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        }
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }

    /*
        static methods
     */
    public static void printNumberOfEmployees(){
        System.out.println("Number of employees are: "+numberOfEmployees);
    }
}
