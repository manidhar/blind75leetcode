package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// TC - Time Complexity
// SC - Space Complexity

/* 
For this program

TC - O(n)
SC - O(n)
*/

public class OptimizedTwoSum {

  public static void main(String args[]) {
    // Create a Scanner object to read input
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for input
    System.out.print("Enter array of integers separted by space : ");
    String numsString = scanner.nextLine();
    System.out.print("Enter target value : ");
    int targetValue = scanner.nextInt();
    scanner.close();

    // convert nums string to nums array
    int[] nums = Arrays.stream(numsString.split(" ")).mapToInt(Integer::parseInt).toArray();

    // logic to find the sum
    HashMap<Integer, Integer> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < nums.length; i++) {
      int diff = targetValue - nums[i];
      if (!map.containsKey(diff)) {
        map.put(nums[i], i);

      } else {
        sb.append("[");
        sb.append(i);
        sb.append(",");
        sb.append(map.get(diff));
        sb.append("]");
      }
    }

    // printing the output

    if (sb.length() > 0) {
      System.out.println(sb.toString());
    } else {
      System.out.println("Pair not found for the provided target");
    }

  }
}
