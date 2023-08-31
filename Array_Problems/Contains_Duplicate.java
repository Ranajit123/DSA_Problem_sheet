import java.util.*;
public class Contains_Duplicate {
  // using Brute Force Approach
  public static boolean containsDuplicateBF(int arr[]){
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i] == arr[j]){
          return true;
        }
      }
    }
    return false;
  }

  // using sorting method
  public static boolean containsDuplicateS(int arr[]){
    Arrays.sort(arr);
    for(int i=1; i<arr.length; i++){
      if(arr[i]==arr[i-1]){
        return true;
      } 
    }
    return false;
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3};
    // System.out.println(containsDuplicateBF(arr));
    System.out.println(containsDuplicateS(arr));
  }
}
