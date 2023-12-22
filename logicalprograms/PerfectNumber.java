package com.day7.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for Perfect Number: ");
        int number = scanner.nextInt();
        checkPerfectNumber(number);
    }

    static void checkPerfectNumber(int number) {
        int sum = 0;
        System.out.println("Divisors of " + number + ":");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\nSum of divisors: " + sum);
        if (sum == number) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }
    }
}
