package com.day7.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci Series: ");
        int n = scanner.nextInt();
        generateFibonacciSeries(n);
    }

    static void generateFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
