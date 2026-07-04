package com.sh;

public final class Final {
    public final void greet(){
        System.out.println("Welcome back");
    }
}
/*
    Final Class
    A final class is a class declared with the final keyword. It cannot be inherited (extended) by any other class.

    Characteristics of a Final Class
        * Declared using the final keyword.
        * Cannot be extended (inherited).
        * Can contain constructors, methods, and variables.
        * Methods inside a final class cannot be overridden because the class itself cannot be subclassed.
        * Used to prevent inheritance and increase security.



    A final method is a method declared with the final keyword. It cannot be overridden by a subclass.

    Characteristics of a Final Method
        * Declared using the final keyword.
        * Cannot be overridden by subclasses.
        * Can be inherited and called by subclasses.
        * Used when the method implementation should remain unchanged.
        * Can be overloaded.
 */

//class Child extends Final{
//
//}


