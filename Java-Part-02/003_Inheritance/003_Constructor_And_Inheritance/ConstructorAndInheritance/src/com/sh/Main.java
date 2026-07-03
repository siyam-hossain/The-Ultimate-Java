package com.sh;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();

        System.out.println("is enabled: "+textBox.isEnabled());
        /*
            * it is always true cause we set parameter as true in child class for parent constructor
         */
    }
}
