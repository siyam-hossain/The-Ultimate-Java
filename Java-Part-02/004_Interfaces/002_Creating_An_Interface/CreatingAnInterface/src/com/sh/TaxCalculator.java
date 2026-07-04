package com.sh;

public interface TaxCalculator {
    public double calculateTax();
}
/*
Interface in Java
    Definition
        * An interface is a blueprint of a class that defines a set of methods a class must implement. It specifies what a class should do, but not how it should do it.
        * Interfaces are used to achieve abstraction, loose coupling, and multiple inheritance in Java.

Characteristics of an Interface
    1. Declared using the interface keyword.
    2. Cannot be instantiated (objects cannot be created directly).
    3. A class implements an interface using the "implements" keyword.
    4. All methods are public and abstract by default (unless they are default, static, or private methods in newer Java versions).
    5. All variables are public, static, and final by default (constants).
    6. Supports multiple inheritance, allowing a class to implement multiple interfaces.
    7. Promotes abstraction by defining behavior without implementation.
    8. Promotes loose coupling by allowing classes to depend on abstractions rather than concrete implementations.
    9. Improves code reusability, maintainability, and flexibility.
    10. One interface can extend one or more other interfaces.

Types of Methods in an Interface
    1. Abstract methods – Must be implemented by the implementing class.
    2. Default methods – Have a default implementation and can be inherited.
    3. Static methods – Belong to the interface and are called using the interface name.
    4. Private methods (Java 9+) – Used internally within the interface to support code reuse.

Advantages of Interfaces
    1. Achieves abstraction.
    2. Supports multiple inheritance.
    3. Reduces coupling between classes.
    4. Improves flexibility and extensibility.
    5. Makes applications easier to test and maintain.
    6. Encourages programming to interfaces instead of implementations.

Limitations of Interfaces
    1. Cannot create objects directly.
    2. Cannot have instance variables (only constants).
    3. Cannot have constructors.
    4. Abstract methods do not contain implementation.
 */