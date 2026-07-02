import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        do {
            System.out.print("Response: ");
            response = scanner.nextLine().toLowerCase();
        }while (!response.equals("quit"));
        System.out.println("you entered: "+response);
    }
}
