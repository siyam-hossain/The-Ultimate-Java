package com.sh;

public class TaxReport {
    private TaxCalculator calculator;


    public void show(TaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println("tax: "+tax);
    }

}
/*
Definition
    Method Injection is a type of Dependency Injection (DI) where the dependency is passed directly as a parameter to a method instead of through the constructor or a setter.

Simple Formula
    Dependency is passed through a method parameter.

Characteristics
    * Dependency is provided through a method.
    * The dependency is used only when that method is called.
    * Creates loose coupling.
    * Suitable for dependencies needed only for a specific operation.
    * The class does not need to store the dependency as a field.
 */