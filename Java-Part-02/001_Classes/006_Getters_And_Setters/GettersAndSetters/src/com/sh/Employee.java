package com.sh;

public class Employee {
    /*
        1. to create automatically getter and setter
        2. move cursor indicator to that variable name
        3. then press alt+Enter
        4. select getter and setter
     */
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary <=0 ){
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0 ){
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        }
        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }
}
