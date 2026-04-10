package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {

    public static int compareNumber;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Please give me a number: ");
        compareNumber = myObj.nextInt();

        System.out.println("Is your number even: " + isEven(compareNumber));
        System.out.println("Is your number postive: " + isPositive(compareNumber));

    }

    public static boolean isEven(int number) {
        return compareNumber % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return  compareNumber > 0;
    }
}
