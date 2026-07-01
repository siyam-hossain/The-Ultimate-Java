public class Main {
    public static void main(String[] args){
        System.out.println("2+3: "+2+3);
        System.out.println("2-3: "+(2-3));
        System.out.println("2*3: "+(2*3));
        System.out.println("2/3: "+((double)2/3));

        int x = 1;
//        increment operator : postfix
        x++;
        int y = x++;
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        int a = 2;
        int b = ++a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);

//        augmented or compiled assignment operator
        a += 2;
        System.out.println("a: "+a);

    }
}
