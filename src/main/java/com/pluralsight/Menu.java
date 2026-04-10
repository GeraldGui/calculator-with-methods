package com.pluralsight;

public class Menu {

    public static void main(String[] args) {

        // Int for while loop
        int i = 0;

        // While loop to get method twice
        while (i < 2) {
            displayMenu();
            i++;
        }
    }

    // Made method displayMenu
    public static void displayMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99");
    }
}
