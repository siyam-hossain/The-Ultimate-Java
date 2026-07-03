package com.sh;

public class Main {
    public static void main(String[] args) {
        var uiControl = new UIControl();
        uiControl.disable();
        System.out.println("is enable: "+uiControl.isEnabled());


        var textBox = new TextBox();
        uiControl.enable();
        System.out.println("is enable: "+textBox.isEnabled());
    }
}
