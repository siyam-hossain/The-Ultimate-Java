package com.sh;

public class TextBox extends UIControl{
    private String text = "";

    public TextBox() {
        /*
            * if base or parent class no default constructor, parent has constructor with parameter
            * but child has default constructor
            * then the first instruction of the child class constructor will be
            * super(parameter_for_parent)
            * Note: must be first instruction
         */
        super(true); // it can be false
        System.out.println("Text Box");
    }
}
