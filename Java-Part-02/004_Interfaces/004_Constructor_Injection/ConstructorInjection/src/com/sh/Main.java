package com.sh;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2026(100_000);
        /*
         * Creates an object of TaxCalculator2026,
         * which implements the TaxCalculator interface.
         */

        var report = new TaxReport(calculator);
        report.show();
    }
}
/*
    TaxCalculator (Interface Reference)
                │
                ▼
    +-------------------------+
    | TaxCalculator2026       |
    | income = 100000         |
    | calculateTax()          |
    +-------------------------+
 */