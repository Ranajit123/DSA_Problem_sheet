// Find the max and min element of a array

import java.util.*;
public class max_min_element_in_arr{

  // using creting function
  public static int max_in_arr(int arr[]){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }

  public static int min_in_arr(int arr[]){
    int min = Integer.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    return min;
  }
  public static void main(String[] args) {
    int arr[] = {3, 5, 4, 1, 9};
    // System.out.println("Maximum in the array: "+max_in_arr(arr));
    // System.out.println("Minimum in the array: "+min_in_arr(arr));
    
    // using sorting algorithms
    Arrays.sort(arr);
    System.out.println("Maximum in the array: "+arr[arr.length-1]);
    System.out.println("Minimum in the array: "+arr[0]);
  }
}