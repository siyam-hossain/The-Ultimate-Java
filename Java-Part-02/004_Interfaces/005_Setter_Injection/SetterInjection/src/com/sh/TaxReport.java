package com.sh;

public class TaxReport {
    private TaxCalculator calculator;

    //default constructor
    public TaxReport() {
    }

    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println("tax: "+tax);
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
/*
Setter Injection

    Setter Injection is a type of Dependency Injection (DI) in which the required dependency is provided to a class through a setter method after the object is created.

Simple Formula
    Dependency is passed through a setter method.

Characteristics
    * Dependency is injected using a setter method.
    * Object is created first, then the dependency is provided.
    * Creates loose coupling.
    * Easy to replace or change the dependency at runtime.
    * Best for optional dependencies.
    * Makes testing easier.

Note: without using constructor injection we can do similar things using setter injection.
 */