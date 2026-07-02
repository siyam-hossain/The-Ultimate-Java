import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i<=15; i++){
            if (i==5) continue;
            if (i==15) break;
            System.out.println("i: "+i);
        }
    }
}
