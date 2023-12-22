package com.day7.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for Prime Number: ");
        int number = scanner.nextInt();
        checkPrimeNumber(number);
    }

    static void checkPrimeNumber(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
