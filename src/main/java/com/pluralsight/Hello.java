package com.pluralsight;

public class Hello {

    public static void main(String[] args) {

        // Call method sayHello
        sayHello();

        // Call method sayGoodbye
        sayGoodbye();

        // Call method sayGoodMorning
        sayGoodMorning();
    }

    // Make method to print Hello, World!
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    // Make method to print Goodbye!
    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    // Make method to print Good morning!
    public static void sayGoodMorning() {
        System.out.println("Good morning!");
    }
}
