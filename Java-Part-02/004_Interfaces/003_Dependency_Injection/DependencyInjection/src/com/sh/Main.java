package com.sh;

public class Main {
    public static void main(String[] args) {

    }
}
/*
Dependency Injection (DI) in Java
    Dependency Injection (DI) is a design pattern in which the dependencies (objects a class needs) are provided from outside instead of being created inside the class.

In simple words:
    1. Don't create the dependency inside the class; inject (provide) it from outside.
    2. DI helps achieve loose coupling between classes.

Characteristics of Dependency Injection
    1. Dependencies are provided from outside the class.
    2. Promotes loose coupling.
    3. Improves code reusability.
    4. Makes unit testing easier.
    5. Increases flexibility and maintainability.
    6. Supports the Dependency Inversion Principle (DIP).
    7. Allows implementations to be changed without modifying dependent classes.

Types of Dependency Injection
    1. Constructor Injection:
        a. Dependencies are provided through the class constructor.
        b. Most commonly used and recommended.
        c. Ensures required dependencies are available when the object is created.

    2. Setter Injection
        i. Dependencies are provided through setter methods.
       ii. Allows dependencies to be changed after object creation.
      iii. Suitable for optional dependencies.

    3. Field Injection
        i. Dependencies are injected directly into fields.
       ii. Common in frameworks such as Spring.
      iii. Less preferred because it makes testing and dependency visibility harder.

Advantages of Dependency Injection
    * Reduces coupling between classes.
    * Improves maintainability.
    * Makes unit testing easier.
    * Increases flexibility.
    * Promotes code reusability.
    * Simplifies replacing implementations.
    * Supports SOLID design principles, especially the Dependency Inversion Principle.
 */