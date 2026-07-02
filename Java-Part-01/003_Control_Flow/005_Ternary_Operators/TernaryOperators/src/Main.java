public class Main {
    public static void main(String[] args) {
        int income = 120_000;
//        since it is not a boolean type that why we use ternary operators(?   :)
        String className = (income > 100_000 ? "First" : "Economy");
        System.out.println("Class Name: "+className);
    }
}
