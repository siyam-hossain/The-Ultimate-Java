package com.sh;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};

    /*
        Definition:
        Polymorphism means "many forms." It is the ability of a single method, object, or interface to perform different behaviors depending on the context.

        For example, the same method sound() behaves differently for different animals:
            Dog → Barks
            Cat → Meows
            Cow → Moos

        Types of Polymorphism
        1. Compile-Time Polymorphism (Static Polymorphism)
            * Achieved through method overloading.
            * The method to call is determined at compile time.
            * Same method name with different parameter lists.
        *
        2. Runtime Polymorphism (Dynamic Polymorphism)
            * Achieved through method overriding.
            * The method to execute is determined at runtime.
            * Uses inheritance and upcasting.
     */


        /*
            * every class has there won render methods
            * that override parent render methods
            * here we work with method overriding approach
         */

        for (var control : controls){
            control.render();
        }
    }
}
