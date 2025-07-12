// Java program to demonstrate methods overloading

package com.methods;

// Main class
public class Main {

    // Method multiplication(int a, int b) to multiply two integers
    public int multiplication(int number, int number1){
        int result = number * number1;
        return result;
    }

    // Method  multiplication(int a, int b, int c) to  multiply integers
    public int multiplication(int number, int number1, int number2){
        int result = number * number1 * number2;
        return result;
    }

    // Method  multiplication(int a, int b) to multiply two doubles
    public double multiplication(double number, double number1){
        double result = number * number1;
        return result;
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Creating Main instance
        Main m = new Main();

        // Multiplication of two integers
        int mul = m.multiplication(3, 7);
        // Printing to console the result
        System.out.println(mul);

        // Multiplication of three integers
        int mul1 = m.multiplication(3, 7, 2);
        // Printing to console the result
        System.out.println(mul1);

        // Multiplication of two doubles
        double mul2 = m.multiplication(3.2, 2.0);
        // Printing to console the result
        System.out.println(mul2);
    }
}