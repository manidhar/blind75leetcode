package com.leetcode.easy;

// TC - Time Complexity
// SC - Space Complexity

/* 
For this program

TC - O(n2)
SC - O(1)
*/

public class BruteforceTwoSum {

  public static void main(String args[]) {
    int[] nums = { 3, 2, 4 };
    int target = 6;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if ((nums[i] + nums[j]) == target) {
          sb.append("[");
          sb.append(i);
          sb.append(",");
          sb.append(j);
          sb.append("]");
          break;
        }
        System.out.println("Inner loop");
      }
      System.out.println("Outter loop");
      if (sb.length() > 0) {
        break;
      }
    }
    // print the result
    if (sb.length() > 0) {
      System.out.println(sb.toString());
    } else {
      System.out.println("no match found");
    }

  }
}
