package com.sh;

public class Main {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {


        int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
        double annualInterest = Console.readNumber("Annual Interest Rate: ", 1, 30);
        int years = (int) Console.readNumber("Period (Years): ", 1, 30);


        MortgageReport.printMortgage(principal, annualInterest, years);
        MortgageReport.printPaymentSchedule(principal, annualInterest, years);


    }

    public static double calculateMortgage(int principal, double annualInterest, int years) {
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        return principal *
                ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
    }

    public static double calculateBalance(int principal, double annualInterest,
                                          int years, int numberOfPaymentsMade) {

        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        return principal *
                ((Math.pow(1 + monthlyInterest, numberOfPayments)
                        - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
    }
}