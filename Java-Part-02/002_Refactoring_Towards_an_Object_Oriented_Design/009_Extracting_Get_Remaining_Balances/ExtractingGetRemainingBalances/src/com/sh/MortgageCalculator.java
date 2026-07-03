package com.sh;

public class MortgageCalculator {

    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private  double annualInterest;
    private  int years;

    public MortgageCalculator(int principal, double annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage() {
        double monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        return principal *
                ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
    }


    public double calculateBalance(int numberOfPaymentsMade) {

        double monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        return principal *
                ((Math.pow(1 + monthlyInterest, numberOfPayments)
                        - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
    }

    public double[] getRemainingBalances(){
        var balances = new double[getNumberOfPayments()];

        for (short month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateBalance(month);
        }
        return balances;
    }


    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private double getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}
