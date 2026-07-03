package com.sh;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();

        // System.out.println(textBox.toString());

        textBox.setText("Hello world");
        System.out.println("our custom text: "+textBox.toString());

    }
}
