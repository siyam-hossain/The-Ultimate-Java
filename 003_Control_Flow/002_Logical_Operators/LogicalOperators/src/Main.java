public class Main {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;

        System.out.println("Warm: "+isWarm);
        System.out.println("Logical or: "+(true||false));
        System.out.println("Logical not: "+(!false));
    }
}
