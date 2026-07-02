import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        float annualInterest = 0;
        byte years = 0;

        // Principal
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();

            if (principal >= 1_000 && principal <= 1_000_000)
                break;

            System.out.println("Enter a value between 1,000 and 1,000,000.");
        }

        // Annual Interest Rate
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();

            if (annualInterest >= 1 && annualInterest <= 30)
                break;

            System.out.println("Enter a value between 1 and 30.");
        }

        // Period (Years)
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();

            if (years >= 1 && years <= 30)
                break;

            System.out.println("Enter a value between 1 and 30.");
        }

        String mortgageFormatted = NumberFormat.getCurrencyInstance()
                .format(calculateMortgage(principal, annualInterest, years));

        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close();
    }

    public static double calculateMortgage(int principal, float annualInterest, byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        return principal *
                ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
    }
}