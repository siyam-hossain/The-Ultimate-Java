package com.sh;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(){
        calculator = new TaxCalculator(100_000);
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
/*
Tight Coupling

    Tight coupling occurs when one class is directly dependent on another concrete class. This means one class knows too much about another class's implementation, making them strongly connected.

    In your example, TaxReport directly creates and uses TaxCalculator, so TaxReport is tightly coupled to TaxCalculator.

Characteristics of Tight Coupling
    1. One class directly depends on another concrete class.
    2. Changes in one class often require changes in the dependent class.
    3. Classes are difficult to reuse independently.
    4. Testing becomes more difficult.
    5. The system becomes less flexible and harder to extend.

Issues (Drawbacks) of Tight Coupling
    1. Difficult to Maintain: Changes in one class can affect many other classes.
    2. Difficult to Test: It is hard to replace dependencies with test (mock) objects.
    3. Low Flexibility: Replacing or upgrading one implementation requires modifying dependent classes.
    4. Low Reusability: Classes cannot be easily reused in different applications or contexts.
    5. High Dependency: Classes become highly dependent on each other's implementation.
    6. Violates the Dependency Inversion Principle (DIP): High-level modules depend directly on low-level modules instead of abstractions.


 */