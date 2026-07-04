package com.sh;

public abstract class UIControl {
    private boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        //System.out.println("UI Control");
//    }

    /*
        Abstract Class

        Definition:
        An abstract class is a class declared with the abstract keyword. It cannot be instantiated (you cannot create an object of it). It is used as a base class for other classes.

        Characteristics of an Abstract Class
            * Declared using the abstract keyword.
            * Cannot be instantiated.
            * Can contain both abstract and concrete (implemented) methods.
            * Can have constructors, variables, and static methods.
            * Can contain both final and non-final methods (but an abstract method cannot be final).
            * A subclass must implement all abstract methods or itself be declared abstract.

        Abstract Method
        An abstract method is a method declared with the abstract keyword and without a method body. It must be implemented by the subclass.

        Characteristics of an Abstract Method
            * Declared using the abstract keyword.
            * Has no method body (no implementation).
            * Must be inside an abstract class.
            * Must be overridden by the subclass.
            * Cannot be private, static, or final.
     */


    /*
        * since we declare this method as abstract method
        * any of the class which inherit or extends must implement
     */
    public abstract void render();


    public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }
    public boolean isEnabled(){
        return isEnabled;
    }
}
