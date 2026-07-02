package com.sh;

public class Main {
    public static void main(String[] args) {
        /*
            we can replace TextBox class with var for more clean code
         */
        var textBox1 = new TextBox();
        textBox1.setText("text box 1");

        System.out.println(textBox1.text);

        textBox1.clear();
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        System.out.println(textBox1.text);

        var textBox3 = new TextBox();
        textBox3.setText("text box 3");
        System.out.println(textBox3.text);
    }
}
