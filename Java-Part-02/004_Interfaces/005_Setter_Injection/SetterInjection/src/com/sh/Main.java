package com.sh;

public class Main {
    public static void main(String[] args) {
        /*
            with the help of constructor injection
         */
        var calculator = new TaxCalculator2026(100_000);
        var report = new TaxReport(calculator);
        report.show();

        /*
            * setter injection
         */
        var report1 = new TaxReport();
        report1.setCalculator(new TaxCalculator2027());
        report1.show();
    }
}
