package com.sh;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        var textBox2 = textBox1;

        textBox2.setText("Both has same stack memory, therefore they are combinely one object");
        System.out.println(textBox1.text);
        System.out.println(textBox2.text);
        /*
            java has garbage collector which automatically remove object if it is not used
         */
    }
}
