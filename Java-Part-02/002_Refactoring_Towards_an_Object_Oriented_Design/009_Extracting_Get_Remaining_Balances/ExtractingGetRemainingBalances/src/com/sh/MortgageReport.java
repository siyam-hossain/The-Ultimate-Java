package com.sh;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currencyInstance;
    private  MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------------------");

        for (double balance : calculator.getRemainingBalances()){
            System.out.println(currencyInstance.format(balance));
        }
    }

    public void printMortgage() {

        String mortgageFormatted = currencyInstance.format(calculator.calculateMortgage());

        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------------------");
        System.out.println("Monthly Payment: " + mortgageFormatted);
    }

}
