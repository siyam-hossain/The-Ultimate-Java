import java.awt.*;

public class Main {
    public static void main(String[] args){
//        primitive behaviour
//        they are independent
        byte a = 1;
        byte b = a;
        a = 2;
        System.out.println("is b change: b->: "+b);

//        reference behaviour
//        hold the address not actual values
//        they are not independent
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println("point 2 also update while updating point 1: "+point2);

    }
}
