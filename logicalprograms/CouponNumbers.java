package com.day7.logicalprograms;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupon numbers: ");
        int n = scanner.nextInt();
        int totalRandomNumbers = generateDistinctCoupons(n);
        System.out.println("Total random numbers needed: " + totalRandomNumbers);
    }

    static int generateDistinctCoupons(int n) {
        Set<Integer> couponSet = new HashSet<>();
        Random random = new Random();
        int totalRandomNumbers = 0;

        while (couponSet.size() < n) {
            int randomNumber = random.nextInt(100); // Adjust the range as needed
            totalRandomNumbers++;
            couponSet.add(randomNumber);
        }

        return totalRandomNumbers;
    }
}
