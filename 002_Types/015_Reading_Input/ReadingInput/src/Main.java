import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        scanner.nextLine(); //consume left over things


        System.out.print("Name: ");
        String name = scanner.nextLine().trim();

        System.out.println("Your name is : "+name);
        System.out.println("Your age: "+age);

    }
}
