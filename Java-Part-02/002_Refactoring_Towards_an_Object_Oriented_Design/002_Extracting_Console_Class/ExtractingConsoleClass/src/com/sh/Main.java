package com.sh;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    /*
        How to save refactor a method to a class:
        1. select that method we want to refactor to a class
        2. then refactor
        3. Move here
        4. Select public
        5. package name: com.sh.ClassName
        6. Ok
     */

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
        double annualInterest = Console.readNumber("Annual Interest Rate: ", 1, 30);
        int years = (int) Console.readNumber("Period (Years): ", 1, 30);

        String mortgageFormatted = NumberFormat.getCurrencyInstance()
                .format(calculateMortgage(principal, annualInterest, years));

        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------------------");
        System.out.println("Monthly Payment: " + mortgageFormatted);

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------------------");

        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }

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