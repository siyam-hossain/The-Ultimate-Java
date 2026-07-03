package com.sh;

public class TextBox extends UIControl{
    private String text = "";

    public TextBox() {
        super(true); // it can be false
        System.out.println("Text Box");
    }
    public void setText(String text){
        this.text = text;
    }
    /*
        * let's override Object class toString() method
        * Normally toString() method return this type of output:
        * output: com.sh.TextBox@5f184fc6
        * we want to set it as our custom way
        * to do that we use annotation called @override

        * this is not only work on object class
        * it works on parent or super class or grandparent class
     */
    @Override
    public String toString(){
        return text;
    }


}
