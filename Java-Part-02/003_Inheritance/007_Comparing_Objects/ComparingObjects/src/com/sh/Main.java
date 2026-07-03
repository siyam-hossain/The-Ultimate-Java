package com.sh;

public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);

        System.out.println("point1 == point2: "+(point1 == point2));
        /*
            * we don't override default equal method
            * then it returns false instead, although both co-ordinate same
            * it is because by default it compare by reference
            * to work properly:
                * then override equal method in point class
                * by alt+Insert
                * choose: equals and hash
                * then select instance of
                * select desire fields
         */
        System.out.println("point1 is equal point2: "+(point1.equals(point2)));
        System.out.println("point1 hash code: "+point1.hashCode());
        System.out.println("point2 hash code: "+point2.hashCode());
    }
/*
    a. == compares references for objects, while equals() compares contents.
    b. == works with both primitive types and objects; equals() works only with objects.
    c. == cannot be overridden, but equals() can be overridden to define custom equality.
    d. For primitive data types, use == because it compares actual values.
    e. For objects (such as String, Integer, or custom classes), use equals() when you want to compare their contents.
 */

}
