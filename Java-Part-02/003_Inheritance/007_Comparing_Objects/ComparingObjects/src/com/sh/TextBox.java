package com.sh;

public class TextBox extends UIControl{
    private String text = "";

    public TextBox() {
        super(true); // it can be false
        //System.out.println("Text Box");
    }
    public void setText(String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }


}
