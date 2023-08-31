public class Maximum_subarray_sum {

  /********************* print sub array function ***************************/
  // Time complexity O(n3) Space Complexity O(1)
  public static void printSubArr(int arr[]){
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<=arr.length; j++){
        for(int k=i; k<j; k++){
          System.out.print(arr[k]+" ");
        }
        System.out.println();
      }
    }
  }

  /******************maximum subarray sum using brute force approach**************************/
  // Time complexity O(n3) Space Complexity O(1)
  public static int maxSubArrSumBF(int arr[]){
    int maxSum = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<=arr.length; j++){
        int currSum = 0;
        for(int k=i; k<j; k++){
          currSum += arr[k];
        }
        if(currSum>maxSum){
          maxSum = currSum;
        }
      }
    }
    return maxSum;
  }

  /******************maximum subarray sum using Prefix Sum approach**************************/
  // Time complexity O(n2) Space Complexity O(n)
  public static int maxSubArrSumPS(int arr[]){
    int len = arr.length; 
    int maxSum = Integer.MIN_VALUE;
    int prefixSum[] = new int[len];

    // calculating the prefix array
    prefixSum[0]= arr[0];
    for(int i=1; i<len; i++){
      prefixSum[i] = prefixSum[i-1] + arr[i];
    }

    for(int i=0; i<len; i++){
      for(int j=i; j<len; j++){
        int currSum = i==0? prefixSum[j] : prefixSum[j]-prefixSum[i-1];
        if(currSum>maxSum){
          maxSum = currSum;
        }
      }
    } 
    return maxSum;
  }

  /******************maximum subarray sum using kadane's algorithm**************************/

  public static int maxSubArrSumKA(int arr[]){
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    boolean falg = false;
    for(int i=0; i<arr.length; i++){
      // check the array contain all -ve value or not
      if(arr[i] >0){
        falg = true;
        break;
      }
      currSum = arr[i];
      maxSum = Math.max(maxSum, currSum);
    }
    int idx = 0;
    while(falg && idx<arr.length){
      currSum += arr[idx];
      if(currSum<0){
        currSum = 0;
      }
      maxSum = Math.max(currSum, maxSum);
      idx++;
    }
    return maxSum;
  }
  public static void main(String[] args) {
    int arr[] = {-2, -1, -3};
    // printSubArr(arr);
    // System.out.println(maxSubArrSumBF(arr));
    // System.out.println(maxSubArrSumPS(arr));
    System.out.println(maxSubArrSumKA(arr));
    
  }
}
