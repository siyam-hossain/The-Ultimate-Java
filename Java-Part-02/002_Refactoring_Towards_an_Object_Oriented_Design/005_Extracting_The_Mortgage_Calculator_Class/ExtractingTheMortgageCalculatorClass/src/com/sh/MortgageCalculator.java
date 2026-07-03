package com.sh;

public class MortgageCalculator {
    private int principal;
    private  double annualInterest;
    private  int years;

    public MortgageCalculator(int principal, double annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }


    // static methods can use only static filed or variable of a class
    /*
        * Convert to static method to instance method
        * just removing static keyword
     */


    public double calculateMortgage() {
        double monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        int numberOfPayments = years * Main.MONTHS_IN_YEAR;

        return principal *
                ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
    }

    public double calculateBalance(int numberOfPaymentsMade) {

        double monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        int numberOfPayments = years * Main.MONTHS_IN_YEAR;

        return principal *
                ((Math.pow(1 + monthlyInterest, numberOfPayments)
                        - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
    }
}
