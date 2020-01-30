//Alysyn Howell 1/30/2020 Prog Fundamentals for Android
package com.company.Howell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double answer = userInput();
        while (answer >= -460) {
            double calc = convert(answer);
            displayCalc(calc);
            answer = userInput();

        }
    }

    static double userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in Fahrenheit:");
        double a = input.nextDouble();

        return a;
    }

    static double convert(double a) {
        double b = a - 32;
        double c = b * 5;
        double d = c / 9;
        return d;
    }

    static void displayCalc(double a) {

        System.out.println("The temperature is " + a + " degrees celsius.");

    }
}
