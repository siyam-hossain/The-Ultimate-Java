package com.sh;

import java.util.Scanner;

public class Console {
    /*
        Instead of using scanner at multiple page we use only one places,
        and access only this class only
     */

    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt){
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {

        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();

            if (value >= min && value <= max)
                return value;

            System.out.println("Enter a value between " + min + " and " + max);
        }
    }
}
