package com.sh;

public class Main {
    public static void main(String[] args) {
        /*
            * Upcasting
              Casting an object to one of this super types

            * Down-casting
              Casting an object to one of its subtypes
         */

        var control = new UIControl(true);
        show(control);

        var textBox = new TextBox();
        /*
            * this is safe
            * textbox inherit control : textbox is a control (relation)
            * show_(textBox) : textBox automatically upcast to control
         */
        show_(textBox);
    }
    public static void show(UIControl control){
    /*
        Upcasting Definition:
        Upcasting is the process of converting a child class (subclass) object into a parent class (superclass) reference. It happens automatically (implicitly).

        Characteristics:
        * Implicit (automatic) conversion.
        * Safe because every child object is also a parent object.
        * Used to achieve runtime polymorphism.
        * Parent reference can access only the members defined in the parent class (unless overridden methods are called).
   */
        System.out.println("---------------Up casting--------------------");
        System.out.println(control);
        System.out.println("-----------end of show() --------------\n");
    }
    public static void show_(UIControl control){
    /*
         * when we upcast to parent class
         * we have no longer access to subclass methods
         * if we want to access them then cast control back to TextBox
     */

    /*
        Definition:
        Down casting is the process of converting a parent class reference back into a child class reference. It must be done explicitly (manually).

        Characteristics:
        * Explicit conversion is required.
        * Can throw a ClassCastException if the object is not actually of the child type.
        * Allows access to child-specific methods and fields.
        * Usually performed after checking with the instanceof operator.
     */
        System.out.println("---------------Down casting--------------------");
        if (control instanceof TextBox){
            var textBox = (TextBox)control;
            textBox.setText("Hello world");
            System.out.println(textBox.toString());
        }
        System.out.println("-----------end of show_() __________\n");
    }
}
