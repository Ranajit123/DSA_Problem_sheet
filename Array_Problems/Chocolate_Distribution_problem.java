/* 
Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

1.Each student gets one packet.
2.The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.*/

import java.util.*;
public class Chocolate_Distribution_problem {
  public static int chocolateDistribution(int arr[], int m){
    // case1 -> where student and chocolate number 0
    if(m==0 || arr.length == 0){
      return 0;
    }

    // case2 -> where student number is more than chocolate number
    if(m>arr.length){
      return -1;
    }

    Arrays.sort(arr);
    int minDiff = Integer.MAX_VALUE;
    int i = 0;
    while(i+m-1<arr.length){
      // calculating the difference
      int diff = arr[i+m-1] - arr[i];
      // compare with minmum difference
      minDiff = Math.min(minDiff, diff);
      i++;
    }
    return minDiff;
  }
  public static void main(String[] args) {
    int arr[]={3, 4, 1, 9, 56, 7, 9, 12};
    int m = 5;
    System.out.println(chocolateDistribution(arr, m));
  }
}
