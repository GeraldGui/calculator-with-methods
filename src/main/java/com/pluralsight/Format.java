package com.pluralsight;

import java.util.Scanner;

public class Format {

    // Make public String fullName
    public static String fullName;

    public static void main(String[] args) {
        // Create Scanner
        Scanner myObj = new Scanner(System.in);

        String firstName;
        String lastName;

        // Ask User for First Name
        System.out.print("Please tell me your First Name: ");
        firstName = myObj.nextLine();

        // Ask User for Last Name
        System.out.print("Please tell me your Last Name: ");
        lastName = myObj.nextLine();

        // Call method
        formatName(firstName, lastName);

        System.out.println(fullName);

    }

    // Make method formatName
    public static String formatName(String first, String last) {
        fullName = last + " " + first;

        return fullName;
    }
}
