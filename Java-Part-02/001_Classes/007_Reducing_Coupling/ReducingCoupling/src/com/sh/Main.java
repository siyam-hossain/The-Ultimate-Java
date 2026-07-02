package com.sh;

public class Main {
    public static void main(String[] args) {
        /*
            1. Coupling in Java refers to the degree of interdependence and connectivity between different classes, methods, or modules within an application.
            2. It measures how much a change in one class forces changes in another.
         */

        /*
            1. how to create object fast
            2. write new then class_name()
            3. alt+Enter
            4. then again enter
            5. after that if we want to change class_name with var
            6. move cursor inside that class and press alt+Enter
            7. then again enter
         */
        var browser = new Browser();
        browser.navigate("127.0.0.1");

    }
}
