package com.sh;

public interface UIWidget extends Draggable, Resizable {
    void render();
}
/*
Interface Segregation Principle (ISP)
    The Interface Segregation Principle (ISP) is the "I" in the SOLID principles.

It states:
    Clients should not be forced to depend on interfaces they do not use.

In simple words:
    Instead of one large interface, create several small, specific interfaces.

Why Do We Need ISP?
    * Suppose you create one interface containing many methods.
    * Some classes may only need a few of those methods, but they are forced to implement all of them.

This leads to:
    * Unnecessary code
    * Empty method implementations
    * Poor design
    * Difficult maintenance
    * ISP solves this by splitting one large interface into multiple smaller interfaces.

Characteristics
    * Creates small, focused interfaces.
    * Classes implement only the methods they need.
    * Reduces unnecessary dependencies.
    * Promotes loose coupling.
    * Improves maintainability.
    * Makes the system easier to extend.
    * Supports the Single Responsibility Principle (SRP).

Advantages
    * Less coupling between classes.
    * Easier to maintain.
    * Easier to test.
    * More flexible design.
    * Better code reusability.
    * Prevents unnecessary method implementation.

Disadvantages
    * May increase the number of interfaces.
    * Requires careful design to avoid too many tiny interfaces.
    * Before ISP (Bad Design)

One large interface contains many unrelated methods.
    Worker
     ├── work()
     ├── eat()
     ├── sleep()
     ├── code()
     └── drive()

A class that only needs work() is still forced to implement the other methods.

After ISP (Good Design)
Split the large interface into smaller ones.

    Workable
       └── work()

    Eatable
       └── eat()

    Drivable
       └── drive()

    Sleepable
       └── sleep()

Now each class implements only the interfaces it needs.

 */