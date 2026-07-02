import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        double r = (annualInterestRate)/100/12;
        int n = years*12;
        int p = principal;

        double result = p*( (r*Math.pow(1+r,n)) / (Math.pow(1+r, n)-1) );

        String mortgage = NumberFormat.getCurrencyInstance().format(result);
        System.out.print("Mortgage: "+mortgage);
    }
}
