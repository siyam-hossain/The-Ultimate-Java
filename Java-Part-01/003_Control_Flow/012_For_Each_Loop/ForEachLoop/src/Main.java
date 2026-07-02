public class Main {
    public static void main(String[] args) {
//        string of arrays
        String[] fruits = {
                "apple",
                "mango",
                "orange"
        };

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruits: "+fruits[i]);
        }

        for (String fruit : fruits){
            System.out.println("F: "+fruit);
        }

    }
}
