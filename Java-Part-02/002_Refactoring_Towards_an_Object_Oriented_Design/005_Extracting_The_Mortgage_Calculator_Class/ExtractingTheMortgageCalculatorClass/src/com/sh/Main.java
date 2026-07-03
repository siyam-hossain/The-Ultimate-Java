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

}