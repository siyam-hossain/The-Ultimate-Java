package com.sh;

import java.text.NumberFormat;

public class MortgageReport {
    // creating a filed that can access any method
    /*
        * To create field by refactoring
        * right click and go to refactor while cursor in object name
        * then under this selection menu select introduce field

     */
    private static MortgageCalculator calculator;


    public static void printMortgage(int principal, double annualInterest, int years) {

        var calculator = new MortgageCalculator(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance()
                .format(calculator.calculateMortgage());

        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------------------");
        System.out.println("Monthly Payment: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int principal, double annualInterest, int years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------------------");

        for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++) {
            double balance = calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
