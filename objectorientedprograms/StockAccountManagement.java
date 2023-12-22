package com.day7.objectorientedprograms;

import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    private String shareName;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String shareName, int numberOfShares, double sharePrice) {
        this.shareName = shareName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double calculateStockValue() {
        return numberOfShares * sharePrice;
    }

    public String getShareName() {
        return shareName;
    }

    public int numberOfShares() {
        return numberOfShares;
    }

    public double sharePrice() {
        return sharePrice;
    }
}

class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double calculateTotalStockValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateStockValue();
        }
        return totalValue;
    }

    public void printStockReport() {
        System.out.println("Stock Report:");
        for (Stock stock : stocks) {
            System.out.println("Share Name: " + stock.getShareName());
            System.out.println("Number of Shares: " + stock.numberOfShares());
            System.out.println("Share Price: $" + stock.sharePrice());
            System.out.println("Stock Value: $" + stock.calculateStockValue());
            System.out.println();
        }
        System.out.println("Total Stock Value: $" + calculateTotalStockValue());
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stocks: ");
        int numberOfStocks = scanner.nextInt();

        StockPortfolio stockPortfolio = new StockPortfolio();

        for (int i = 0; i < numberOfStocks; i++) {
            scanner.nextLine(); // Consume the newline left by previous nextInt()
            System.out.println("\nEnter details for Stock " + (i + 1) + ":");
            System.out.print("Enter Share Name: ");
            String shareName = scanner.nextLine();
            System.out.print("Enter Number of Shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Enter Share Price: $");
            double sharePrice = scanner.nextDouble();

            Stock stock = new Stock(shareName, numberOfShares, sharePrice);
            stockPortfolio.addStock(stock);
        }

        stockPortfolio.printStockReport();
    }
}
