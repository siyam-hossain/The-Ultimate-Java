package com.sh;

public class Employee {

    /*
        Shortcut for creating constructor
        1. Select variable which is used in constructor
        2. then click alt+Enter
        3. then choose whatever you want
     */

    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
//    it is overload the method calculate wage with parameter
    public int calculateWage(){
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary <=0 ){
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0 ){
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
}
