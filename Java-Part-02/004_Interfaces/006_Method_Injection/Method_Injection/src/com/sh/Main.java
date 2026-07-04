package com.sh;

public class Main {
    public static void main(String[] args) {
        var report = new TaxReport();
        // method injection
        report.show(new TaxCalculator2027());
    }
}
