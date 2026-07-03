package com.sh;

public class Main {
    public static void main(String[] args) {
        var box1 = new TextBox();
        var box2 = box1;
        System.out.println("hash code box1: "+box1.hashCode());
        System.out.println("hash code box2: "+box2.hashCode());

        System.out.println("box1 is equal box2: "+box2.equals(box1));

        var box3 = new TextBox();
        System.out.println("box1 is equal box3: "+box1.equals(box3));

        System.out.println(box3.toString());

    }
}
