public class max_min_element_in_arr{
  public static int max_in_arr(int arr[]){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int arr[] = {3, 5, 4, 1, 9};
    System.out.println("Maximum in the array: "+max_in_arr(arr));
  }
}