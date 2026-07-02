package com.sh;

/*
    public access modifier allows other class to access this class
 */
public class TextBox {
    public String text; //field

    public void setText(String text){
        /*
            this refers the current object
            . helps to access the member or methods of that object
         */
        this.text = text;
    }
    public void clear(){
        this.text = "";
    }
}
