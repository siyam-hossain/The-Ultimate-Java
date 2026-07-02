import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
//        0.1 -> 10%
//        factory method
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("currency: "+currency.format(1234567.879));

        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println("percent: "+percent.format(0.1));

//        method chaining
        String result = NumberFormat.getPercentInstance().format(.45);
        System.out.println("Result: "+result);
    }
}
