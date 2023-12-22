package com.day7.logicalprograms;

import java.util.Scanner;

public class Stopwatch {
    private static long startTime;
    private static long endTime;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to start the stopwatch.");
        scanner.nextLine();
        startStopwatch();

        System.out.println("Press Enter to stop the stopwatch.");
        scanner.nextLine();
        stopStopwatch();

        System.out.println("Elapsed Time: " + getElapsedTime() + " milliseconds");
    }

    static void startStopwatch() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started...");
    }

    static void stopStopwatch() {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped.");
    }

    static long getElapsedTime() {
        return endTime - startTime;
    }
}
