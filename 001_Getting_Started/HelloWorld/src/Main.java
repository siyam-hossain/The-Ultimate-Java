import java.util.Scanner;

public class Main {
    public static void main(String[] ags){
        System.out.println("Hello world");

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.println("a+b: "+(a+b));
    }
}
