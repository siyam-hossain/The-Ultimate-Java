import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";
        while (!response.equals("quit")){
            System.out.print("Response: ");
            response = scanner.nextLine().toLowerCase();
        }
        System.out.println("You entered: "+response);
    }
}
