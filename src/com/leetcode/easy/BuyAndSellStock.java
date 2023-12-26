package com.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

public class BuyAndSellStock {

  public static int maxProfit(int[] stockPrices) {
    int left = 0;
    int maxProfit = 0;
    for (int right = 1; right < stockPrices.length; right++) {
      int diff = stockPrices[right] - stockPrices[left];
      if (diff > 0) {
        if (diff > maxProfit) {
          maxProfit = diff;
        }
      } else {
        left = right;
      }
    }
    return maxProfit;
  }

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter stock prices : ");
    String stockPricesStr = scanner.nextLine();
    scanner.close();
    int[] stockPrices = Arrays.stream(stockPricesStr.split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    // logic to find max profit
    System.out.println("Max Profit : " + maxProfit(stockPrices));
  }
}
