public class Main {
    public static void main(String[] args){
//        implicit casting
//        byte > short > int > long

        short x = 1; // 2 byte
        int y = x+2; // 4 byte
        // 2 byte can fit in 4 byte

        System.out.println("y: "+y);

//        all primitive classes has wrapper classes
        String a = "1";
        int b = Integer.parseInt(a) + 44;
        System.out.println("b: "+ b);

    }
}
