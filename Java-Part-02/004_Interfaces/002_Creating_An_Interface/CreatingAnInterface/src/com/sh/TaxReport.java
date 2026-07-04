package com.sh;

public class TaxReport {
    private TaxCalculator2026 calculator;

    public TaxReport(){
        calculator = new TaxCalculator2026(100_000);
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
