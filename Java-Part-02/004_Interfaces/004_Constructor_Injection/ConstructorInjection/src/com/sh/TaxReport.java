package com.sh;

public class TaxReport {
/*
   * Replacing TaxCalculator2026 class with TaxCalculator interface
   * TaxCalculator calculator = new TaxCalculator(); // ❌ Compile-time error
 */
    private TaxCalculator calculator;
    /*
        * here calculator is not an interface object
        * it is an interface reference variable that can refer to any object of a class that implements the interface.
     */

    public TaxReport(TaxCalculator calculator){
        /*
         * Receives an object of a class that implements TaxCalculator.
         * The object is automatically upcast to the TaxCalculator interface
         * because TaxCalculator2026 implements TaxCalculator.
         */
        this.calculator = calculator;
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
/*
        TaxReport
           │
           ▼
        calculator -----------------------► TaxCalculator2026 object
                    (interface reference)
 */



/*
Definition
    Constructor Injection means passing the required object (dependency) through the constructor instead of creating it inside the class.

Simple Formula:
    Dependency is passed through the constructor.

Characteristics
    * Dependency is passed through the constructor.
    * Creates loose coupling.
    * Easy to test.
    * Easy to maintain.
    * Required dependency is available when the object is created.
    * Recommended type of Dependency Injection.
 */
