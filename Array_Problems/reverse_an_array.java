// Reverse the Given Array
public class reverse_an_array {

  // This function will print the array
  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }

  // using Two pointer method
  public static void revArr(int arr[], int si, int ei){
    while(si<ei){
      int temp = arr[si];
      arr[si] = arr[ei];
      arr[ei] = temp;

      si++;
      ei--;
    }
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println("Original Array");
    printArr(arr);
    System.out.println();
    
    System.out.println("Reversed Array:");
    revArr(arr, 0, arr.length-1);
    printArr(arr);
  }
}
